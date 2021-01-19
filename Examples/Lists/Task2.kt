// Lists/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var occurrences = 0
  for (e in list) {
    if (number == e) {
      occurrences++
    }
  }
  return occurrences
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}
