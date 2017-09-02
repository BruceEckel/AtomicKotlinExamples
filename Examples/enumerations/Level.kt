// enumerations/Level.kt
package enumerations
import atomicTest.eq

enum class Level {
  Overflow, High, Medium, Low, Empty
}

fun main(args: Array<String>) {
  Level.Medium eq "Medium"
}
