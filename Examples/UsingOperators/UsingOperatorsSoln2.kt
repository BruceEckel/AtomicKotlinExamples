// UsingOperators/UsingOperatorsSoln2.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package usingoperatorssoln2

fun create() = MutableList(10) { it }

fun assignAppendIncrementContains() {
  println("assignAppendIncrementContains()")
  val list = create()
  list[9] = 99
  list += 100
  list[10]++
  println(list)
  println(101 in list)
}

fun minus() {
  println("minus()")
  val list = create()
  println(list - 5)
  println(list - 5 - 6 - 7 - 8)
  println(list - 10)
  list -= 0
  list -= 1
  list -= -1
  println(list)
}

fun plus() {
  println("plus()")
  var list = create() + 11 + 12 + 13
  list += 14
  println(list)
}

fun main() {
  assignAppendIncrementContains()
  minus()
  plus()
}
/* Exercise Output:
assignAppendIncrementContains()
[0, 1, 2, 3, 4, 5, 6, 7, 8, 99, 101]
true
minus()
[0, 1, 2, 3, 4, 6, 7, 8, 9]
[0, 1, 2, 3, 4, 9]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[2, 3, 4, 5, 6, 7, 8, 9]
plus()
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14]
*/
