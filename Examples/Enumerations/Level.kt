// Enumerations/Level.kt
package enumerations
import atomictest.eq

enum class Level {
  Overflow, High, Medium, Low, Empty
}

fun main() {
  Level.Medium eq "Medium"
}
