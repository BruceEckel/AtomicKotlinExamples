// DelegationTools/DelegToolsSoln1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package propertyDelegationToolsExercise2
import kotlin.properties.Delegates
import atomictest.*

data class Flag(val b: Boolean = false)

fun main() {
  var d: Double by Delegates.notNull()
  var s by Delegates.notNull<String>()
  var f: Flag by Delegates.notNull()
  capture {
    d
  } eq "IllegalStateException: Property " +
    "d should be initialized before get."
  capture {
    s
  } eq "IllegalStateException: Property " +
    "s should be initialized before get."
  capture {
    f
  } eq "IllegalStateException: Property " +
    "f should be initialized before get."
  d = 1.1
  s = "yes"
  f = Flag(true)
  d eq 1.1
  s eq "yes"
  f eq "Flag(b=true)"
}
