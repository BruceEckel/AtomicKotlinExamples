// UsingOperators/Unexpected.kt
import atomictest.eq

fun main(args: Array<String>) {
  var list = listOf(1, 2)
  list += 3  // Probably unexpected
  list eq "[1, 2, 3]"
}
