// combiningListsWithZip/IndexWithZip.kt
import atomicTest.eq

fun number(s: String) =
    s.indices.zip(s.toList())

fun main(args: Array<String>) {
  number("Howdy") eq
      listOf(0 to 'H', 1 to 'o', 2 to 'w', 3 to 'd', 4 to 'y')
}
