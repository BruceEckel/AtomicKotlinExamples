// LabeledThis/LabeledThis.kt
package labeledthis
import atomictest.eq

class Outer { // implicit label @Outer
  inner class Inner { // implicit label @Inner
    // implicit label @ext:
    fun Int.ext(): String.() -> Unit {
      val a = this@Outer
      val b = this@Inner
      val c = this // Int ext() receiver
      val c1 = this@ext // Int ext() receiver

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
  }
}

fun main(args: Array<String>) {
  val outer = Outer()
  val inner = outer.Inner()
  with (inner) {
    1.ext()                // [3]
  }
}

fun Outer.Inner.extension() {
  1.ext()                    // [4]
  val funcHere = 1.ext()
  "abc".funcHere()           // [5]
}
