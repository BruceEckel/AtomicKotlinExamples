// Destructuring/ForLoop.kt
import atomictest.eq

fun main() {
  var result = ""
  val map = mapOf(1 to "one", 2 to "two")
  for((key, value) in map)
    result += "$key = $value, "
  result eq "1 = one, 2 = two, "

  result = ""
  val listOfPairs =
    listOf(Pair(1, "one"), Pair(2, "two"))
  for((i, s) in listOfPairs)
    result += "($i, $s), "
  result eq "(1, one), (2, two), "
}
