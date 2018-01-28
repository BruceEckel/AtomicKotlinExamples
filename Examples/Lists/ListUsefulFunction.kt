// Lists/ListUsefulFunction.kt
import atomictest.eq

fun main(args: Array<String>) {
  val doubles =
    listOf(1.1, 2.2, 3.3, 4.4)
  doubles.min() eq 1.1
  doubles.max() eq 4.4

  val strings = listOf("Twas", "Brillig",
    "And", "Slithy", "Tove")
  strings eq listOf("Twas", "Brillig", "And",
    "Slithy", "Tove")
  strings.sorted() eq listOf("And", "Brillig",
    "Slithy", "Tove", "Twas")
  strings.reversed() eq listOf("Tove",
    "Slithy", "And", "Brillig", "Twas")
  strings.first() eq "Twas"
  strings.takeLast(2) eq
    listOf("Slithy", "Tove")
}
