// Lists/ParameterizedTypes.kt
package parameterizedtypes
import atomictest.eq

fun main(args: Array<String>) {
  // Type is inferred:
  val numbers = listOf(1, 2, 3)
  val strings = listOf("one", "two", "three")
  // Exactly the same, but explicitly typed:
  val numbers2: List<Int> = listOf(1, 2, 3)
  val strings2: List<String> =
    listOf("one", "two", "three")

  numbers eq numbers2
  strings eq strings2
}
