// companionObjects/CompanionObject.kt
package companionObjects1

import atomicTest.eq

class X {
  companion object {
    fun foo() = 3
  }
}

fun main(args: Array<String>) {
  X.foo() eq 3
}
