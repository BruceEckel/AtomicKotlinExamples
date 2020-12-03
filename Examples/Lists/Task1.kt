// Lists/Task1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var max = 0
  for (e in list) {
    if (max <= e) {
      max = e
    }
  }
  return max
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}
