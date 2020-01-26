// Composition/CompositionExercise3.kt
package compositionex3
import atomictest.*

private val trace = Trace()

interface DataBase {
  fun write(key: String, value: String)
  fun read(key: String): String
}

class NonRelational : DataBase {
  private val db =
    mutableListOf<Pair<String, String>>()
  override fun write(
    key: String, value: String
  ) {
    db.add(Pair(key, value))
  }
  override fun read(key: String) =
    db.first { it.first == key }.second
}

class InMemory : DataBase {
  private val db =
    mutableMapOf<String, String>()
  override fun write(
    key: String, value: String
  ) {
    db[key] = value
  }
  override fun read(key: String) =
    db[key] ?: ""
}

class Mock : DataBase {
  private var k = ""
  private var v = ""
  override fun write(
    key: String, value: String
  ) { k = key; v = value }
  override fun read(key: String) = v
}

class Holder(val db: DataBase) {
  fun store(k: String, v: String) =
    db.write(k, v)
  fun fetch(k: String) = db.read(k)
  private val data = """
  color: purple
  dog: husky
  art: deco
  """.trimIndent().lines()
     .map { it.split(": ") }
  fun test() {
    for(line in data) {
      store(line[0], line[1])
      trace(fetch(line[0]))
    }
  }
}

fun main() {
    Holder(NonRelational()).test()
    Holder(InMemory()).test()
    Holder(Mock()).test()
  trace eq """
    purple
    husky
    deco
    purple
    husky
    deco
    purple
    husky
    deco
  """
}
