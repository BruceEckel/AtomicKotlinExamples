// companionObjects/ObjectProperty.kt
package companionObjects2

import atomicTest.eq

class X {
  fun increment(): Int {
    n += 1
    return n
  }

  companion object {
    private var n: Int = 0 // Only one of these
  }
}


fun main(args: Array<String>) {
  val a = X()
  val b = X()
  a.increment() eq 1
  b.increment() eq 2
  a.increment() eq 3
}
