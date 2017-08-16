// parameterizedTypes/ParameterizedReturnTypes.kt
import atomicTest.eq

// Return type is inferred:
fun inferred(c1: Char, c2: Char) =
    listOf(c1, c2)

// Explicit return type:
fun explicit(c1: Char, c2: Char): List<Char> =
    listOf(c1, c2)

fun main(args: Array<String>) {
  inferred('a', 'b') eq "[a, b]"
  explicit('y', 'z') eq "[y, z]"
}
