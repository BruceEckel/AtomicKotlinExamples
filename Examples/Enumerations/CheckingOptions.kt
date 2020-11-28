// Enumerations/CheckingOptions.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package enumerations
import atomictest.*
import enumerations.Level.*

fun checkLevel(level: Level) {
  when (level) {
    Overflow -> trace(">>> Overflow!")
    Empty -> trace("Alert: Empty")
    else -> trace("Level $level OK")
  }
}

fun main() {
  checkLevel(Empty)
  checkLevel(Low)
  checkLevel(Overflow)
  trace eq """
    Alert: Empty
    Level Low OK
    >>> Overflow!
  """
}
