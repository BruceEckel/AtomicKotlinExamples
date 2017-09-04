// ListOperations/SimpleMap.kt
import atomictest.eq

fun main(args: Array<String>) {
  listOf(1, 2, 3, 4).map {
    it + 1
  } eq listOf(2, 3, 4, 5)
}
