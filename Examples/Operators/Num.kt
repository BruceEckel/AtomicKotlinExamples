// Operators/Num.kt
package operators
import atomictest.eq

data class Num(val n: Int)

operator fun Num.plus(rval: Num) =
  Num(n + rval.n)

fun main(args: Array<String>) {
  Num(4) + Num(5) eq Num(9)
  Num(4).plus(Num(5)) eq Num(9)
}
