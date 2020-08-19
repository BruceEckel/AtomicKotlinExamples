// Abstract/Implementations.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package abstractclasses
import atomictest.eq

interface Parent {
  val ch: Char
  fun f(): Int
  fun g() = "ch = $ch; f() = ${f()}"
}

class Actual(
  override val ch: Char        // [1]
): Parent {
  override fun f() = 17        // [2]
}

class Other: Parent {
  override val ch: Char        // [3]
    get() = 'B'

  override fun f() = 34        // [4]
}

fun main() {
  Actual('A').g() eq "ch = A; f() = 17" // [5]
  Other().g() eq "ch = B; f() = 34"     // [6]
}
