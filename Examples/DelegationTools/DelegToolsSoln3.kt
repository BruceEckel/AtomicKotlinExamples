// DelegationTools/DelegToolsSoln3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertyDelegationToolsExercise4
import atomictest.eq
import kotlin.properties.Delegates

class PositiveInt(i: Int) {
  var n: Int by Delegates.vetoable(i) {
    _, _, new -> new > 0
  }
}

fun main() {
  var pi = PositiveInt(2)
  pi.n eq 2
  pi.n = 200
  pi.n eq 200
  pi.n = -1
  pi.n eq 200
}
