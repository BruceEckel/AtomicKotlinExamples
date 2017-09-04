// Operators/MemberOperator.kt
package operators
import atomictest.eq

data class Num2(val n: Int) {
  operator fun plus(rval: Num2) =
    Num2(n + rval.n)
}

fun main(args: Array<String>) {
  Num2(4) + Num2(5) eq Num2(9)
}
