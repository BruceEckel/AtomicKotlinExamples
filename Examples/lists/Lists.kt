// lists/Lists.kt
import atomicTest.eq

fun main(args: Array<String>) {
  // A List holds other objects:
  val l1 = listOf(1, 3, 5, 7, 11, 13)
  l1 eq "[1, 3, 5, 7, 11, 13]"           // [1]

  l1[4] eq 11 // "Indexing" into a List  // [2]

  // Take each element of the List:
  var result = ""
  for (i in l1) {                        // [3]
    result += "$i "
  }
  result eq "1 3 5 7 11 13 "

  val l3 = listOf(1.1, 2.2, 3.3, 4.4)    // [4]
  l3.min() eq 1.1
  l3.max() eq 4.4

  val l4 = listOf("Twa", "Brillig", "And",
      "Slithy", "Tove")
  l4 eq listOf("Twa", "Brillig", "And",
      "Slithy", "Tove")
  l4.sorted() eq listOf("And", "Brillig",
      "Slithy", "Tove", "Twa")
  l4.reversed() eq listOf("Tove", "Slithy",
      "And", "Brillig", "Twa")
  l4.first() eq "Twa"
  l4.takeLast(2) eq listOf("Slithy", "Tove")
}
