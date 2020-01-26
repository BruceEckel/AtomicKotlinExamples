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

private val data = """
  color: purple
  dog: husky
  art: deco
""".trimIndent().lines()
  .map { it.split(": ") }

fun checkWriteRead(db: DataBase) {
  for(line in data) {
    db.write(line[0], line[1])
    trace(db.read(line[0]))
  }
}

fun main() {
  checkWriteRead(NonRelational())
  checkWriteRead(InMemory())
  checkWriteRead(Mock())
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
