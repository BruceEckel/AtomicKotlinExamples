// nonNullAsserts/NonNullAssert.kt

fun main(args: Array<String>) {
  val s1: String? = null
  // Compiles, but produces a
  // KotlinNullPointerException:
  val s2 = s1!!
}
