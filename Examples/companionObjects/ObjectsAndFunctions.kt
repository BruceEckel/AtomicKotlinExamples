// companionObjects/ObjectsAndFunctions.kt
package companionobjects

import atomicTest.eq

class X(val n: Int) {
  fun f() = n * 10
}

fun main(args: Array<String>) {
  val x1 = X(1)
  val x2 = X(2)
  x1.f() eq 10
  x2.f() eq 20
}
