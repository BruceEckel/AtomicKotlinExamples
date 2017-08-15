// nullableTypes/Dereference.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s1: String = "abc"
  val s2: String? = s1

  s1.length eq 3          // [1]
  // Doesn't compile
  // s2.length            // [2]
}
