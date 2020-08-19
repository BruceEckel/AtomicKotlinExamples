// LocalFunctions/LocalFunctions.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val logMsg = StringBuilder()
  fun log(message: String) =
    logMsg.appendln(message)
  log("Starting computation")
  val x = 42  // Imitate computation
  log("Computation result: $x")
  println(logMsg.toString())
}
/* Output:
Starting computation
Computation result: 42
*/
