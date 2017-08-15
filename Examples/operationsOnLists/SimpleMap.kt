// operationsOnLists/SimpleMap.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val l = listOf(1, 2, 3, 4)
  l.map { it + 1 } eq listOf(2, 3, 4, 5)
}
