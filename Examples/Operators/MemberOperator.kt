// Operators/MemberOperator.kt
package operators

data class Num2(val n: Int) {
  operator fun plus(rval: Num2) =
    Num2(this.n + rval.n)
}

fun main(args: Array<String>) {
  println(Num2(4) + Num2(5))
}
