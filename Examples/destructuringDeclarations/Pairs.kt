// destructuringDeclarations/Pairs.kt
import atomicTest.eq

fun compute1(input: Int) =
    if (input > 5)
      Pair(input * 2, "High")
    else
      Pair(input * 2, "Low")

fun main(args: Array<String>) {
  compute1(7) eq Pair(14, "High")
  compute1(4) eq Pair(8, "Low")

  val result = compute1(5)
  result.first eq 10
  result.second eq "Low"
}
