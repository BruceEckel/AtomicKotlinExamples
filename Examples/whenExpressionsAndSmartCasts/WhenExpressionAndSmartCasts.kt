// whenExpressionsAndSmartCasts/WhenExpressionAndSmartCasts.kt
package whenexpressionscasts
import atomicTest.eq

fun acceptAnything(x: Any): String =
    when (x) {
      is String -> "A String: $x of length ${x.length}"
      is Int ->
        if (x < 20) "An Int Less than 20: $x"
        else "Some Other Int: $x"
      is Dog -> "A dog: ${x.bark()}"
      else -> "I don't know what that is!"
    }

class Dog {
  fun bark(): String = "yip!"
}

fun main(args: Array<String>) {
  acceptAnything(5) eq
      "An Int Less than 20: 5"
  acceptAnything(25) eq "Some Other Int: 25"
  acceptAnything("Some text") eq
      "A String: Some text of length 9"

  acceptAnything(Dog()) eq "A dog: yip!"
  acceptAnything(listOf(1, 2, 5)) eq
      "I don't know what that is!"
}
