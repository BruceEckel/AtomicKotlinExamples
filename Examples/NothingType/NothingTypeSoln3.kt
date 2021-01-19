// NothingType/NothingTypeSoln3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package theNothingTypeExercise3
import atomictest.*

private var _debug: Boolean = true

class Failure(msg: String) : Exception(msg)

fun fail(msg: String): Nothing =
  throw Failure(msg)

fun debug(test: Boolean) {
  trace("debug($test) with _debug[$_debug]")
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
  trace eq """
    debug(true) with _debug[true]
    debug(false) with _debug[true]
    debug(true) with _debug[false]
    debug(false) with _debug[false]
  """
}
