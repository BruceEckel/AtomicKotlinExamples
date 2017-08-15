// destructuringDeclarations/ComputationResult.kt
import atomicTest.eq

data class ComputationResult(val data: Int, val info: String)

fun compute3(input: Int) =
    if (input > 5)
      ComputationResult(input * 2, "High")
    else
      ComputationResult(input * 2, "Low")

fun main(args: Array<String>) {
  val (value, description) = compute3(7)
  value eq 14
  description eq "High"
}
