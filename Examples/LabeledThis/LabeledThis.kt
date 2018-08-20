// LabeledThis/LabeledThis.kt
package labeledthis
import atomictest.eq

class Outer { // Implicit label @Outer
  inner class Inner { // Implicit label @Inner
    fun Int.ext() { // Implicit label @ext
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
    }
  }
}

fun main(args: Array<String>) {
  val outer = Outer()
  val inner = outer.Inner()
}
