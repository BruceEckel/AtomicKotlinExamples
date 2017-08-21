// companionObjects/ObjectFunctions.kt
package companionObjects3

import atomicTest.eq

class X {
  companion object {
    private var n: Int = 0
    fun increment(): Int {
      n += 1
      return n
    }
  }
}

fun main(args: Array<String>) {
  X.increment() eq 1
  X.increment() eq 2
}
