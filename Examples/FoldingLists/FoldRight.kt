// FoldingLists/FoldRight.kt
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')

  list.fold("*") {
    accumulator, element ->
    "($accumulator) + $element"
  } eq "((((*) + a) + b) + c) + d"

  list.foldRight("*") {
    element, accumulator ->
    "$element + ($accumulator)"
  } eq "a + (b + (c + (d + (*))))"
}
