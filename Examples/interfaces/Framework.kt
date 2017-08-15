// interfaces/Framework.kt
import atomicTest.eq

interface Framework {
  val part1: Int
  fun part2(): Double
  // Even without definitions:
  fun templateMethod() = part1 + part2()
}

fun operation(impl: Framework) =
    impl.templateMethod()

class Implementation : Framework {
  override val part1 = 42
  override fun part2() = 2.71828
}

fun main(args: Array<String>) {
  operation(Implementation()) eq 44.71828
}
