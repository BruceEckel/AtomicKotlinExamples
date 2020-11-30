// FoldingLists/RunningFold.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = listOf(11, 13, 17, 19)
  list.fold(7) { sum, n ->
    sum + n
  } eq 67
  list.runningFold(7) { sum, n ->
    sum + n
  } eq "[7, 18, 31, 48, 67]"
  list.reduce { sum, n ->
    sum + n
  } eq 60
  list.runningReduce { sum, n ->
    sum + n
  } eq "[11, 24, 41, 60]"
}
