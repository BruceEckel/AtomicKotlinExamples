// Abstract/WithPropertyAccessor.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package abstractclasses
import atomictest.eq

interface WithPropertyAccessor {
  val a: Int
    get() = 11
}

class Impl: WithPropertyAccessor

fun main() {
  Impl().a eq 11
}
