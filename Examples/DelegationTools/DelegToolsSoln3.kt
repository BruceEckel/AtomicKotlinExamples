// DelegationTools/DelegToolsSoln3.kt
package delegtoolssoln3
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
