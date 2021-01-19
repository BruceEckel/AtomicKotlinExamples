// InheritanceExtensions/PrivateAccess.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package inheritanceextensions
import atomictest.eq

class Z(var i: Int = 0) {
  private var j = 0
  fun increment() {
    i++
    j++
  }
}

fun Z.decrement() {
  i--
  // j -- // Cannot access
}
