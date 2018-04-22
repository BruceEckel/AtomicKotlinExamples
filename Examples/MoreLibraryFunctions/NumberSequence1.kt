// MoreLibraryFunctions/NumberSequence1.kt
import atomictest.eq

fun main(args: Array<String>) {
  val naturalNumbers =
    generateSequence(1) { it + 1 }
  naturalNumbers.take(3).toList() eq
    listOf(1, 2, 3)
  naturalNumbers.take(10).count() eq 10
}
