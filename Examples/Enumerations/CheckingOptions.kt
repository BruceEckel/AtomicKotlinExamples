// Enumerations/CheckingOptions.kt
import atomictest.eq
import enumerations.Level
import enumerations.Level.*

fun checkLevel(level: Level) {
  when (level) {
    Overflow -> println(">>> Overflow!")
    Empty -> println("Alert: Empty")
    else -> println("Level $level OK")
  }
}

fun main() {
  checkLevel(Empty)
  checkLevel(Low)
  checkLevel(Overflow)
}
/* Output:
Alert: Empty
Level Low OK
>>> Overflow!
*/
