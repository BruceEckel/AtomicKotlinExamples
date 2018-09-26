// NullableTypes/NullableTypes.kt
import atomictest.eq

fun main() {
  val s1 = "abc"            // [1]

  // Compile-time error:
  // val s2: String = null  // [2]

  // Nullable definitions:
  val s3: String? = null    // [3]
  val s4: String? = s1

  // Compile-time error:
  // val s5: String = s4    // [4]
  val s6 = s4               // [5]

  s1 eq "abc"
  s3 eq null
  s4 eq "abc"
  s6 eq "abc"
}
