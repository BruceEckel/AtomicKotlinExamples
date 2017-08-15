// parameterizedTypes/ParameterizedTypes.kt
import atomicTest.eq

fun main(args: Array<String>) {
  // Type is inferred:
  val l1 = listOf(1, 2, 3)
  val l2 = listOf("one", "two", "three")
  // Exactly the same, but explicitly typed:
  val p1: List<Int> = listOf(1, 2, 3)
  val p2: List<String> =
      listOf("one", "two", "three")

  l1 eq p1
  l2 eq p2
}
