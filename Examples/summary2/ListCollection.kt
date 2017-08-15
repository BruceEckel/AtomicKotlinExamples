// summary2/ListCollection.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val l1 = listOf(19.2, 88.3, 22.1)
  l1 eq listOf(19.2, 88.3, 22.1)
  l1[1] eq 88.3 // Indexing
  l1.reversed() eq listOf(22.1, 88.3, 19.2)
  l1.sorted() eq listOf(19.2, 22.1, 88.3)
  l1.max() eq 88.3
  l1.min() eq 19.2
}
