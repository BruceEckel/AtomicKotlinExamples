// Sequences/EagerVsLazyEvaluation.kt
package sequences

fun Int.isEven(): Boolean {
  println("$this.isEven()")
  return this % 2 == 0
}

fun Int.square(): Int {
  println("$this.square()")
  return this * this
}

fun Int.lessThanTen(): Boolean {
  println("${this}.lessThanTen()")
  return this < 10
}

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4)

  println("----- List: -----")
  val r1 = list
    .filter(Int::isEven)
    .map(Int::square)
    .any(Int::lessThanTen)
  println(r1)

  println("--- Sequence: ---")
  val r2 = list.asSequence()
    .filter(Int::isEven)
    .map(Int::square)
    .any(Int::lessThanTen)
  println(r2)
}
/* Output:
----- List: -----
1.isEven()
2.isEven()
3.isEven()
4.isEven()
2.square()
4.square()
4.lessThanTen()
true
--- Sequence: ---
1.isEven()
2.isEven()
2.square()
4.lessThanTen()
true
*/
