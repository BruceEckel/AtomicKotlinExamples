// ExtensionLambdas/LWRBasics.kt
package extensionlambdas

class X

class Y {
  fun f() = X()
}

fun noArg(lambda: () -> Y): Y =
  lambda()

fun arg(y: Y, lambda: (y: Y) -> X): X =
  lambda(y)

fun Y.ext(lambda: (y: Y) -> X): X =
  lambda(this)

fun receiver(lambda: Y.() -> X): X {
  val y = Y()  // Receiver object
  return y.lambda()
}

fun Y.receiverExt(lambda: Y.() -> X): X =
  lambda()

fun differentLambdas() {
  val y = noArg { Y() }
  arg(y) { it.f() }
  y.ext { it.f() }
  receiver { f() }
  y.receiverExt { f() }
}
