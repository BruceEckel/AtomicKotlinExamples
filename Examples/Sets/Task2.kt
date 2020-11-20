// Sets/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package setsExercise2

import kotlin.random.Random

fun experiment(): Int {
  val set = mutableSetOf<Int>()
  var count = 0
  do {
    count++
    set += Random.nextInt(25) + 1
  } while (set.size < 25)
  return count
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}
