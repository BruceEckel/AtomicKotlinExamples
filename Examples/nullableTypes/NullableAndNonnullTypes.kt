// nullableTypes/NullableAndNonnullTypes.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s1: String = "abc"    // [1]

  // Doesn't compile:
  // val s2: String = null  // [2]

  val s3: String? = null    // [3]
  val s4: String? = s1      // [4]

  // Doesn't compile:
  // val s5: String = s4    // [5]

  s1 eq "abc"
  s3 eq null
  s4 eq "abc"
}
