// Polymorphism/PolyExercise3.kt
package polymorphismExercise3

open class Base {
  open fun f1() {
    println("Base.f1")
    f2()
  }
  open fun f2() = println("Base.f2")
}

class Derived: Base() {
  override fun f1() {
    println("Derived.f1")
    super.f1()
  }
  override fun f2() {
    println("Derived.f2")
    super.f2()
  }
}

fun main() {
  val base: Base = Derived()
  base.f1()
}
/* Example output:
  Derived.f1
  Base.f1
  Derived.f2
  Base.f2
*/
