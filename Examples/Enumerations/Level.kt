// Enumerations/Level.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package enumerations
import atomictest.eq

enum class Level {
  Overflow, High, Medium, Low, Empty
}

fun main() {
  Level.Medium eq "Medium"
}
