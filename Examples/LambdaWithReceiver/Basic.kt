// LambdaWithReceiver/Basic.kt
class Klass1 {
  fun f() {}
}

// Pass receiver to lambda:
fun useF(lwr: Klass1.() -> Unit): Klass1 {
  val k = Klass1()  // Create receiver
  k.lwr() // Call method on receiver
  return k
}

fun main(args: Array<String>) {
  useF { f() }
}
