// Variance/Contravariance.kt
package variance
import atomictest.eq

open class Base {
  open fun f(b: Mallard) = "Base::f"
}

open class Derived : Base() {
  override fun f(b: Duck) =
    "Derived::f"
}

class Derived2 : Derived() {
  /* override */ fun f(b: Bird) =
    "Derived2::f"
}

fun main() {
  Derived2().f(Mallard()) eq "Base::f"
  Derived2().f(Duck()) eq "Derived::f"
  Derived2().f(Bird()) eq "Derived2::f"

  Derived().f(Mallard()) eq "Base::f"
  Derived().f(Duck()) eq "Derived::f"

  Base().f(Mallard()) eq "Base::f"
}
