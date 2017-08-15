// parameterizedTypes/ParameterizedReturnTypes.kt
import atomicTest.eq

// Return type is inferred:
fun inferred(c1: Char, c2: Char, c3: Char) =
    listOf(c1, c2, c3)

// Explicit return type:
fun explicit(c1: Char, c2: Char, c3: Char): List<Char> =
    listOf(c1, c2, c3)

fun main(args: Array<String>) {
  inferred('a', 'b', 'c') eq
      "[a, b, c]"
  explicit('a', 'b', 'c') eq
      "[a, b, c]"
}
