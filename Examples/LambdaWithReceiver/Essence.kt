// LambdaWithReceiver/Essence.kt
package lambdawithreceiver

class A {
  fun af() = 1
}

class B {
  fun bf() = 2
}

val lambda1: (A, B) -> Int = { a, b ->
  a.af() + b.bf()
}

val lambda2: A.(B) -> Int = {
  af() + it.bf()
}

fun f3(lambda: (A, B) -> Int) =
  lambda(A(), B())

fun f4(lambda: A.(B) -> Int) =
  A().lambda(B())

fun f5(lambda: A.(B) -> Int) =
  lambda(A(), B())

fun lambdas() {
  val a = A()
  val b = B()
  lambda1(a, b)
  a.lambda2(b)
  f3 { aa, bb -> aa.af() + bb.bf() }
  f4 { af() + it.bf() }
  f5 { af() + it.bf() }
}
