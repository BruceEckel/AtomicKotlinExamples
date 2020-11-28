// HigherOrderFunctions/RepeatVerbose.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  repeat(2, { trace("hi!") })
  trace eq """
    hi!
    hi!
  """
}
