// ExceptionHandling/ExceptHandlingSoln3.kt
package exceptionhandlingsoln3
import atomictest.Trace
import exceptionhandlingsoln3.Status.*

private val trace = Trace()

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

fun transact(level: Int): Status {
  val db = DataBase()
  val ak = NetConnection("AtomicKotlin.com")
  val rm = NetConnection("RickAndMorty.com")
  try {
    db.open(1, level)
  } catch (e: DBOpenFail) {
    trace("Database Problem $e")
    return Failed
  }
  fun transfer(net: NetConnection): Status {
// Everything up to here is STARTER CODE
    try {
      net.open(2, level)
      db.write(net.read(), 3, level)
    } catch (e: NetworkFail) {
      trace("Network Problem $e")
      return Failed
    } catch (e: DBFail) {
      trace("Database Write Failed $e")
      return Failed
    } finally {
      try {
        net.close(4, level)
      } catch (e: NetworkCloseFail) {
        trace("Network close failed $e")
        throw e
      }
    }
    return Success
  }
  try {
    if (transfer(ak) == Failed)
      return Failed
    if (transfer(rm) == Failed)
      return Failed
  } finally {
    try {
      db.close(5, level)
    } catch (e: DBCloseFail) {
      trace("Database Problem $e")
      throw e
    }
  }
  return Success
}

// All of main() is STARTER CODE:
fun main() {
  for (level in 0..5)
    try {
      trace(transact(level))
    } catch (e: DBCloseFail) {
      trace("main() Problem $e")
    } catch (e: NetworkCloseFail) {
      trace("main() Problem $e")
    }
  trace eq """
  Success
  Database Problem DBOpenFail
  Failed
  Network Problem NetworkOpenFail
  Failed
  Database Write Failed DBWriteFail
  Failed
  Network close failed NetworkCloseFail
  main() Problem NetworkCloseFail
  Database Problem DBCloseFail
  main() Problem DBCloseFail
  """
}
