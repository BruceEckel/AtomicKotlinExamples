// InnerClasses/InnerClassInheritance.kt
package innerclasses
import atomictest.*

private val trace = Trace()

open class Egg {
  private var y = Yolk()
  open inner class Yolk {
    init { trace("Egg.Yolk()") }
    open fun f() { trace("Egg.Yolk.f()") }
  }
  // class Albumen : Yolk()  // ???
  init { trace("New Egg()") }
  fun insertYolk(yy: Yolk) { y = yy }
  fun g() { y.f() }
}

class BigEgg : Egg() {
  inner class Yolk : Egg.Yolk() {
    init { trace("BigEgg.Yolk()") }
    override fun f() {
      trace("BigEgg.Yolk.f()")
    }
  }
  init { insertYolk(Yolk()) }
}

fun main() {
  val egg = BigEgg()
  egg.g()
  trace eq """
  Egg.Yolk()
  New Egg()
  Egg.Yolk()
  BigEgg.Yolk()
  BigEgg.Yolk.f()
  """
}
