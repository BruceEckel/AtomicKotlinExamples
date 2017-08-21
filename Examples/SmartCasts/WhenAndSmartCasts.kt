// SmartCasts/WhenAndSmartCasts.kt
package smartCasts
import atomicTest.eq

fun acceptAnything(x: Any): String =
  when (x) {
    is String ->
      "String: $x of length ${x.length}"
    is Int ->
      if (x < 20) "Int Less than 20: $x"
      else "Some Other Int: $x"
    is Dog -> "Dog: ${x.bark()}"
    else -> "I don't know what that is!"
  }

class Dog {
  fun bark() = "yip!"
}

fun main(args: Array<String>) {
  acceptAnything(5) eq "Int Less than 20: 5"
  acceptAnything(25) eq "Some Other Int: 25"
  acceptAnything("Some text") eq
    "String: Some text of length 9"
  acceptAnything(Dog()) eq "Dog: yip!"
  acceptAnything(listOf(1, 2, 5)) eq
    "I don't know what that is!"
}
