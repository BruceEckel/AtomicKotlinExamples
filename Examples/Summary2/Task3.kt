// Summary2/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val limit: Int) {
  private val list = mutableListOf<Any>()

  val size: Int
    get() = list.size

  val full: Boolean
    get() = list.size == limit

  fun add(a: Any) {
    if (full) throw IllegalStateException("The container is full")
    list += a
  }
}

fun main() {
/*
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
*/
}
