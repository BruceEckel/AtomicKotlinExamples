// LambdaWithReceiver/NestedLWR.kt
package lambdawithreceiver
import atomictest.eq

fun Int.ext(): String.() -> Unit {
  val func = lambda@ fun String.() {
    val d = this // func's receiver
    val d2 = this@lambda
    d eq d2
  }
  val func2 = { s: String ->
    // ext()'s receiver; enclosing
    // lambda doesn't have a receiver
    val d1 = this
  }
  "abc".func()               // [1]
  func2("abc")
  return func                // [2]
}

fun main() {
  val funcHere = 1.ext()
  "abc".funcHere()           // [5]
}
