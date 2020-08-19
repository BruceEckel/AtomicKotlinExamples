// InheritanceExtensions/Convention.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package inheritanceextensions

class X

fun X.f() {}

class Y

fun Y.f() {}

fun callF(x: X) = x.f()

fun callF(y: Y) = y.f()

fun main() {
  val x = X()
  val y = Y()
  x.f()
  y.f()
  callF(x)
  callF(y)
}
