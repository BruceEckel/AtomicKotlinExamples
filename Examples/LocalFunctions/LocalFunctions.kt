// LocalFunctions/LocalFunctions.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val logMsg = StringBuilder()
  fun log(message: String) =
    logMsg.appendLine(message)
  log("Starting computation")
  val x = 42  // Imitate computation
  log("Computation result: $x")
  logMsg.toString() eq """
    Starting computation
    Computation result: 42
  """
}
