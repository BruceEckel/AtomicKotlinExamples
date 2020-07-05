// LambdaWithReceiver/ZeroAndThreeArgs.kt
package lambdawithreceiver

fun zero1(lambda: A.() -> Unit) = lambda(A())
fun zero2(lambda: A.() -> Unit) = A().lambda()
fun A.zero3(lambda: A.() -> Unit) = lambda()

class C {
  fun cf() = 3
}

fun three1(lambda: A.(B, C) -> Int) =
  lambda(A(), B(), C())
fun three2(lambda: A.(B, C) -> Int) =
  A().lambda(B(), C())
fun A.three3(lambda: A.(B, C) -> Int) =
  lambda(B(), C())

fun zeroAndThreeArgs() {
  val a = A()
  val b = B()
  val c = C()
  zero1 { af() }
  zero2 { af() }
  a.zero3 { af() }
  three1 { bb, cc ->
    af() + bb.bf() + cc.cf()
  }
}
