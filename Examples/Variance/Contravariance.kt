// Variance/Contravariance.kt
package variance
import atomictest.eq

open class Base {
  fun f(b: Mallard) = "Base::f"
}

open class Derived : Base() {
  /* override */ fun f(b: Duck) =
    "Derived::f"
}

class Derived2 : Derived() {
  /* override */ fun f(b: Bird) =
    "Derived2::f"
}

fun contraTest(b: Derived2) {
  b.f(Mallard()) eq "Base::f"
  b.f(Duck()) eq "Derived::f"
  b.f(Bird()) eq "Derived2::f"
}

fun main() {
  val base = Base()
  val derived = Derived()
  val derived2 = Derived2()

  val bird = Bird()
  val duck = Duck()
  val mallard = Mallard()

  derived2.f(mallard) eq "Base::f"
  derived2.f(duck) eq "Derived::f"
  derived2.f(bird) eq "Derived2::f"

  derived.f(mallard) eq "Base::f"
  derived.f(duck) eq "Derived::f"
  // derived.f(bird) eq "Derived2::f"

  base.f(mallard) eq "Base::f"
  // base.f(duck) eq "Derived::f"
  // base.f(bird) eq "Derived2::f"
}
