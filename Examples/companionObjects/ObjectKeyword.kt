// companionObjects/ObjectKeyword.kt
package companionobjects2

import atomicTest.eq

object X {
  val n = 2
  fun f() = n * 10
  fun g() = this.n * 20
}

fun main(args: Array<String>) {
  X.n eq 2
  X.f() eq 20
  X.g() eq 40
}
