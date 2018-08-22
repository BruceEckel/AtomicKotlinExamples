// SmartCasts/WhenAndSmartCasts.kt
package smartcasts
import atomictest.eq

fun acceptAny(a: Any) =
  when (a) {
    is String ->
      "String: $a of length ${a.length}"
    is Int ->
      if (a < 20) "Int Less than 20: $a"
      else "Some Other Int: $a"
    is Dog -> "Dog: ${a.bark()}"
    else -> "I don't know what that is!"
  }

fun main(args: Array<String>) {
  acceptAny(5) eq "Int Less than 20: 5"
  acceptAny(25) eq "Some Other Int: 25"
  acceptAny("Some text") eq
    "String: Some text of length 9"
  acceptAny(Dog()) eq "Dog: yip!"
  acceptAny(listOf(1, 2, 5)) eq
    "I don't know what that is!"
}
