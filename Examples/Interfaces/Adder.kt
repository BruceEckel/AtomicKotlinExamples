// Interfaces/Adder.kt
package interfaces
import atomictest.eq

interface Adder {
  val part1: Int
  fun part2(): Double
  fun sum() = part1 + part2()
}

fun addEleven(adder: Adder) =
  adder.sum() + 11

class Calculation : Adder {
  override val part1 = 42
  override fun part2() = 2.71828
}

fun main(args: Array<String>) {
  addEleven(Calculation()) eq 55.71828
}
