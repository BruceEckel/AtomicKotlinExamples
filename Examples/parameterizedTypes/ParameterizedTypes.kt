// ParameterizedTypes/ParameterizedTypes.kt
package parameterizedtypes
import atomictest.eq

fun main(args: Array<String>) {
  // Type is inferred:
  val list1 = listOf(1, 2, 3)
  val list2 = listOf("one", "two", "three")
  // Exactly the same, but explicitly typed:
  val list3: List<Int> = listOf(1, 2, 3)
  val list4: List<String> =
    listOf("one", "two", "three")

  list1 eq list3
  list2 eq list4
}
