// Lambdas/TwoArgLambda.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf('a', 'b', 'c')
  list.mapIndexed { index, element ->
    "[$index: $element]"
  } eq listOf("[0: a]", "[1: b]", "[2: c]")
}
