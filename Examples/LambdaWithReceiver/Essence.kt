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

fun f1(lambda: (A, B) -> Int) =
  lambda(A(), B())

fun f2(lambda: A.(B) -> Int) =
  A().lambda(B())

fun f3(lambda: A.(B) -> Int) =
  lambda(A(), B())

fun lambdas() {
  val a = A()
  val b = B()
  lambda1(a, b)
  a.lambda2(b)
  f1 { aa, bb -> aa.af() + bb.bf() }
  f2 { af() + it.bf() }
  f3 { af() + it.bf() }
}
