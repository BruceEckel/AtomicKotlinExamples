// Logging/LoggingSoln2.kt
package loggingsoln2
import atomictest.eq
import atomiclog.Logger
import loggingsoln2.Status.*

open class Except : Exception() {
  override fun toString() =
    "${this::class.simpleName}"
}

open class DBFail : Except()
class DBOpenFail : DBFail()
class DBWriteFail : DBFail()
class DBCloseFail : DBFail()

class DataBase {
  fun open(id: Int, level: Int) {
    if (id == level) throw DBOpenFail()
  }
  fun write(s: String, id: Int, level: Int) {
    if (id == level) throw DBWriteFail()
  }
  fun close(id: Int, level: Int) {
    if (id == level) throw DBCloseFail()
  }
}

open class NetworkFail : Except()
class NetworkOpenFail : NetworkFail()
class NetworkCloseFail : NetworkFail()

class NetConnection(val url: String) {
  fun open(id: Int, level: Int) {
    if (id == level) throw NetworkOpenFail()
  }
  fun read() = "Dummy Data"
  fun close(id: Int, level: Int) {
    if (id == level) throw NetworkCloseFail()
  }
}

enum class Status { Success, Failed }

// Everything up to here is STARTER CODE

private val logger = Logger("LoggingSoln1.txt")

fun transact(level: Int): Status {
  val db = DataBase()
  val nets = listOf(
    NetConnection("AtomicKotlin.com"),
    NetConnection("RickAndMorty.com")
  )
  try {
    db.open(1, level)
  } catch (e: DBOpenFail) {
    logger.error("$e")
    return Failed
  }
  fun transfer(net: NetConnection): Status {
    try {
      net.open(2, level)
      db.write(net.read(), 3, level)
    } catch (e: Except) {
      logger.error("$e")
      return Failed
    } finally {
      try {
        net.close(4, level)
      } catch (e: NetworkCloseFail) {
        logger.error("$e")
        return Failed
      }
    }
    return Success
  }
  try {
    nets.forEach {
      if (transfer(it) == Failed)
        return Failed
    }
  } finally {
    try {
      db.close(5, level)
    } catch (e: DBCloseFail) {
      logger.error("$e")
      throw e
    }
  }
  return Success
}

// From here on is STARTER CODE

fun main() {
  for (level in 0..5)
    try {
      transact(level)
    } catch (e: Except) {
      logger.error("main(): $e")
    }
  logger.logFile.readText() eq
"""Error: DBOpenFail
Error: NetworkOpenFail
Error: DBWriteFail
Error: NetworkCloseFail
Error: DBCloseFail
Error: main(): DBCloseFail
"""
}
