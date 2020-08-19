// NothingType/NothingTypeSoln1.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package nothingtypesoln1
import atomictest.*

class Failure(msg: String): Exception(msg)

fun fail(msg: String): Nothing {
  println(msg)
  throw Failure(msg)
}

fun require(test: Boolean) {
  if (!test) fail("require() failed")
}

fun check(test: Boolean) {
  if (!test) fail("check() failed")
}

fun main() {
  require(true)
  check(true)
  capture {
    require(false)
  } eq "Failure: require() failed"
  capture {
    check(false)
  } eq "Failure: check() failed"
}
/* Output:
require() failed
Failure: require() failed
check() failed
Failure: check() failed
 */
