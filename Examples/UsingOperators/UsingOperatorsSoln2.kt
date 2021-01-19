// UsingOperators/UsingOperatorsSoln2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package usingOperatorsExercise2
import atomictest.trace

fun create(): MutableList<Int> = MutableList(10) { it }

fun assignAppendIncrementContains() {
  trace("assignAppendIncrementContains()")
  val list = create()
  list[9] = 99
  list += 100
  list[10]++
  trace(list)
  trace(101 in list)
}

fun minus() {
  trace("minus()")
  val list = create()
  trace(list - 5)
  trace(list - 5 - 6 - 7 - 8)
  trace(list - 10)
  list -= 0
  list -= 1
  list -= -1
  trace(list)
}

fun plus() {
  trace("plus()")
  var list = create() + 11 + 12 + 13
  list += 14
  trace(list)
}

fun main() {
  assignAppendIncrementContains()
  minus()
  plus()
  trace eq """
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
  """
}
