// localFunctions/LocalFunctions.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val sb = StringBuilder()
  fun log(message: String) {
    sb.appendln(message)
  }

  log("Starting computation")
  // Imitating computation
  val x = 42
  log("Computation result: $x")

  val expected = """
    Starting computation
    Computation result: 42""".trimIndent()

  sb.toString().trim() eq expected
}
