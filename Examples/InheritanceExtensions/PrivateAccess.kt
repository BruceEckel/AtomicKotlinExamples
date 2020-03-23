// InheritanceExtensions/PrivateAccess.kt
package inheritanceextensionsx
import atomictest.eq

class X(var i: Int = 0) {
  private var j = 0
  fun increment() {
    i++
    j++
  }
}

fun X.decrement() {
  i--
  // j -- // Cannot access
}
