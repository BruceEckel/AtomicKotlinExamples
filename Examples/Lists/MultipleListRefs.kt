// Lists/MultipleListRefs.kt
import atomictest.eq

fun main(args: Array<String>) {
  val first = mutableListOf(1)
  val second: List<Int> = first
  second eq listOf(1)

  first += 2
  // second sees the change:
  second eq listOf(1, 2)
}
