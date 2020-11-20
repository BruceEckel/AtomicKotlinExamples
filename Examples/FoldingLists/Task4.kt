// FoldingLists/Task4.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package foldingListsExercise4

import atomictest.eq

class Condition(val check: (Int) -> Boolean)

fun Condition.combine(other: Condition): Condition =
  Condition { check(it) && other.check(it) }

fun List<Condition>.combineAll(): Condition = reduce(Condition::combine)

fun main() {
  val isPositive = Condition { it > 0 }
  val isEven = Condition { it % 2 == 0 }
  val lessThan10 = Condition { it < 10 }

  val conditions = listOf(isPositive, isEven, lessThan10)
  val isEvenPositiveAndLessThan10 = conditions.combineAll()

  isEvenPositiveAndLessThan10.check(8) eq true

  isEvenPositiveAndLessThan10.check(5) eq false
  isEvenPositiveAndLessThan10.check(12) eq false
}
