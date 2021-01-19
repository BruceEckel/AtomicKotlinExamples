// Abstract/PropertyAccessor.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package abstractclasses
import atomictest.eq

interface PropertyAccessor {
  val a: Int
    get() = 11
}

class Impl : PropertyAccessor

fun main() {
  Impl().a eq 11
}
