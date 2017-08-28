// ListOperations/SimpleMap.kt
import atomicTest.eq

fun main(args: Array<String>) {
  listOf(1, 2, 3, 4).map {
    it + 1
  } eq listOf(2, 3, 4, 5)
}
