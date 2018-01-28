// Enumerations/ImportLevel.kt
import atomictest.eq
import enumerations.Level               // [1]
import enumerations.Level.*

fun main(args: Array<String>) {
  Level.values().toList() eq            // [2]
    "[Overflow, High, Medium, Low, Empty]"

  fun checkLevel(level: Level) =
    when (level) {
      Overflow -> ">>> Overflow!"
      Empty -> "Alert: Empty"
      else -> "Level $level OK"
    }

  checkLevel(Low) eq "Level Low OK"
  checkLevel(Empty) eq "Alert: Empty"
  checkLevel(Overflow) eq ">>> Overflow!"

  Level.values().map {
    "${it.ordinal} - $it"
  } eq listOf(
    "0 - Overflow",
    "1 - High",
    "2 - Medium",
    "3 - Low",
    "4 - Empty")
}
