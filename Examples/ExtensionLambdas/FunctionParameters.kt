// ExtensionLambdas/FunctionParameters.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas

class A {
  fun af() = 1
}

class B {
  fun bf() = 2
}

fun f1(lambda: (A, B) -> Int) =
  lambda(A(), B())

fun f2(lambda: A.(B) -> Int) =
  A().lambda(B())

fun lambdas() {
  f1 { aa, bb -> aa.af() + bb.bf() }
  f2 { af() + it.bf() }
}
