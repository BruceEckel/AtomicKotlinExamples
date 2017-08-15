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

  sb.toString().trim() eq """
    Starting computation
    Computation result: 42""".trimIndent()
}
