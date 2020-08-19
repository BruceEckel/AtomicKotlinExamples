// NothingType/NothingTypeSoln3.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package nothingtypesoln3
import atomictest.*

private var _debug = true

class Failure(msg: String): Exception(msg)

fun fail(msg: String): Nothing =
  throw Failure(msg)

fun debug(test: Boolean) {
  println("debug($test) with _debug[$_debug]")
  if (_debug && !test) fail("debug() failed")
}

fun main() {
  debug(true)
  capture {
    debug(false)
  } eq "Failure: debug() failed"
  _debug = false
  debug(true)
  debug(false)
}
/* Exercise Output:
debug(true) with _debug[true]
debug(false) with _debug[true]
Failure: debug() failed
debug(true) with _debug[false]
debug(false) with _debug[false]
*/
