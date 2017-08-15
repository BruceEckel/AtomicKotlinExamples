// lambdas/CallLater.kt
class Later(val f: () -> Unit) {
  fun call(): Unit = f()
}

fun main(args: Array<String>) {
  val cl = Later { println("now") }
  cl.call()
}
