// NestedAndInnerClasses/QualifiedThis.kt
package nestedandinner
import atomictest.eq

class Outer { // implicit label @Outer
  inner class Inner { // implicit label @Inner
    // implicit label @ext:
    fun Int.ext() {
      val a = this@Outer
      val b = this@Inner
      val c = this // Int ext() receiver
      val c1 = this@ext // Int ext() receiver
    }
  }
}

fun Outer.Inner.extension() = 1.ext() // [4]

fun main() {
  val outer = Outer()
  val inner = outer.Inner()
  with(inner) {
    1.ext()                           // [3]
  }
}
