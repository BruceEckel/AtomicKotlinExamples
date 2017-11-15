// LocalFunctions/LocalFunctions.kt
import atomictest.eq

fun main(args: Array<String>) {
  var logMsg = ""
  fun log(message: String) {
    logMsg += message + "\n"
  }
  log("Starting computation")
  // Imitating computation
  val x = 42
  log("Computation result: $x")
  logMsg eq
    """
    Starting computation
    Computation result: 42
    """.trimIndent()
}
