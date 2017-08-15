// companionObjects/ObjectFunctions.kt
package companionobjects5

import atomicTest.eq

class X {
  companion object {
    var n: Int = 0
    fun increment(): Int {
      n += 1
      return n
    }
    fun count() = increment()
  }
}

fun main(args: Array<String>) {
  X.increment() eq 1
  X.increment() eq 2
  X.count() eq 3
}
