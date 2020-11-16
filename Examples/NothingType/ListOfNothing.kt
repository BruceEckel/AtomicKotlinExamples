// NothingType/ListOfNothing.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val none: Nothing? = null

  var nullableString: String? = null    // [1]
  nullableString = "abc"
  nullableString = none                 // [2]
  nullableString eq null

  val nullableInt: Int? = none          // [3]
  nullableInt eq null

  val listNone: List<Nothing?> = listOf(null)
  val ints: List<Int?> = listOf(null)   // [4]
  ints eq listNone
}
