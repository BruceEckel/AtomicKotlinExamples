// OperatorOverloading/Num.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

data class Num(val n: Int)

operator fun Num.plus(rval: Num) =
  Num(n + rval.n)

fun main() {
  Num(4) + Num(5) eq Num(9)
  Num(4).plus(Num(5)) eq Num(9)
}
