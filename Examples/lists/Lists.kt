// Lists/Lists.kt
import atomictest.eq

fun main(args: Array<String>) {
  // Lists hold other objects:
  val list1 = listOf(1, 3, 5, 7, 11, 13)
  list1 eq "[1, 3, 5, 7, 11, 13]"       // [1]

  list1[4] eq 11 // "[]" is "Indexing"  // [2]

  // Select each element in the List:
  var result = ""
  for (i in list1) {                    // [3]
    result += "$i "
  }
  result eq "1 3 5 7 11 13 "

  val list2 = listOf(1.1, 2.2, 3.3, 4.4)// [4]
  list2.min() eq 1.1
  list2.max() eq 4.4

  val list3 = listOf("Twas", "Brillig", "And",
    "Slithy", "Tove")
  list3 eq listOf("Twas", "Brillig", "And",
    "Slithy", "Tove")
  list3.sorted() eq listOf("And", "Brillig",
    "Slithy", "Tove", "Twas")
  list3.reversed() eq listOf("Tove", "Slithy",
    "And", "Brillig", "Twas")
  list3.first() eq "Twas"
  list3.takeLast(2) eq
    listOf("Slithy", "Tove")
}
