// companionObjects/ObjectProperty.kt
package companionobjects4

import atomicTest.eq

class X {
  fun increment(): Int {
    X.n += 1
    return X.n
  }

  companion object {
    var n: Int = 0 // Only one of these
  }
}


fun main(args: Array<String>) {
  val a = X()
  val b = X()
  a.increment() eq 1
  b.increment() eq 2
  a.increment() eq 3
}
