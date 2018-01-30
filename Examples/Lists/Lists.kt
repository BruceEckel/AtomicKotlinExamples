// Lists/Lists.kt
import atomictest.eq

fun main(args: Array<String>) {
  // Lists hold other objects:
  val ints = listOf(1, 3, 5, 7, 11, 13)
  ints eq "[1, 3, 5, 7, 11, 13]"       // [1]

  // Select each element in the List:
  var result = ""
  for (i in ints)                      // [2]
    result += "$i "
  result eq "1 3 5 7 11 13 "

  // "[]" is "Indexing":
  ints[4] eq 11                        // [3]
}
