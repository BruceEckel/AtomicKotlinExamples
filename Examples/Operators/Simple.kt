// Operators/Simple.kt
package operators

data class Num(val n: Int)

operator fun Num.plus(rval: Num) =
  Num(this.n + rval.n)

fun main(args: Array<String>) {
  println(Num(4) + Num(5))
  println(Num(4).plus(Num(5)))
}
