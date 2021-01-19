// OperationsOnCollections/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operationsOnCollectionsExercise4
import atomictest.eq

fun List<Int>.allNonZero() = all { it != 0 }
fun List<Int>.allNonZero1() = none { it == 0 }
fun List<Int>.allNonZero2() = !any { it == 0 }

fun List<Int>.hasZero() = !all { it != 0 }
fun List<Int>.hasZero1() = !none { it == 0 }
fun List<Int>.hasZero2() = any { it == 0 }

fun main() {
  val list1 = listOf(1, 2, 3)
  list1.allNonZero() eq true
  list1.allNonZero1() eq true
  list1.allNonZero2() eq true

  list1.hasZero() eq false
  list1.hasZero1() eq false
  list1.hasZero2() eq false

  val list2 = listOf(0, 1, 2)
  list2.allNonZero() eq false
  list2.allNonZero1() eq false
  list2.allNonZero2() eq false

  list2.hasZero() eq true
  list2.hasZero1() eq true
  list2.hasZero2() eq true
}
