// InnerClasses/InnerClassInheritance.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package innerclasses
import atomictest.*

open class Egg {
  private var yolk = Yolk()
  open inner class Yolk {
    init { trace("Egg.Yolk()") }
    open fun f() { trace("Egg.Yolk.f()") }
  }
  init { trace("New Egg()") }
  fun insertYolk(y: Yolk) { yolk = y }
  fun g() { yolk.f() }
}

class BigEgg: Egg() {
  inner class Yolk: Egg.Yolk() {
    init { trace("BigEgg.Yolk()") }
    override fun f() {
      trace("BigEgg.Yolk.f()")
    }
  }
  init { insertYolk(Yolk()) }
}

fun main() {
  BigEgg().g()
  trace eq """
    Egg.Yolk()
    New Egg()
    Egg.Yolk()
    BigEgg.Yolk()
    BigEgg.Yolk.f()
  """
}
