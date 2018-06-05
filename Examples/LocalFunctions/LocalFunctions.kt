// LocalFunctions/LocalFunctions.kt

fun main(args: Array<String>) {
  val logMsg = StringBuilder()
  fun log(message: String) {
    logMsg.appendln(message)
  }
  log("Starting computation")
  // Imitating computation
  val x = 42
  log("Computation result: $x")
  println(logMsg.toString())
}
/* Output:
Starting computation
Computation result: 42
*/
