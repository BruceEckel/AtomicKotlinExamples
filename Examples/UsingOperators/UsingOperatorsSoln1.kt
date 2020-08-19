// UsingOperators/UsingOperatorsSoln1.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package usingoperatorssoln1

data class DataMany(
  val a: Int = 1,
  val b: Int = 2,
  val c: Int = 3,
  val d: Int = 4,
  val e: Int = 5,
  val f: Int = 6,
  val g: Int = 7,
  val h: Int = 8,
  val i: Int = 9,
  val j: Int = 10,
)

fun all() {
  val dm = DataMany()
  val (a, b, c, d, e, f, g, h, i, j) = dm
  println("$a $b $c $d $e $f $g $h $i $j")
  println(dm.component1())
  println(dm.component10())
}

fun firstHalf() {
  val dm = DataMany()
  val (a, b, c, d, e) = dm
  println("$a $b $c $d $e")
}

fun secondHalf() {
  val dm = DataMany()
  val (_, _, _, _, _, f, g, h, i, j) = dm
  println("$f $g $h $i $j")
}

fun interspersed() {
  val dm = DataMany()
  val (a, _, c, _, e, _, g, _, i, _) = dm
  println("$a $c $e $g $i")
}

fun main() {
  all()
  firstHalf()
  secondHalf()
  interspersed()
}
/* Exercise Output:
1 2 3 4 5 6 7 8 9 10
1
10
1 2 3 4 5
6 7 8 9 10
1 3 5 7 9
*/
