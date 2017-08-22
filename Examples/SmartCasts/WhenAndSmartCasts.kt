// SmartCasts/WhenAndSmartCasts.kt
package smartCasts
import atomicTest.eq

fun acceptAnything(a: Any) =
  when(a) {
    is String ->
      "String: $a of length ${a.length}"
    is Int ->
      if(a < 20) "Int Less than 20: $a"
      else "Some Other Int: $a"
    is Dog -> "Dog: ${a.bark()}"
    else -> "I don't know what that is!"
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
