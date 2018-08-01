// LibraryHelpers/ResultOfApply.kt
package libraryhelpers
import atomictest.eq

fun main(args: Array<String>) {
  val mutableList = mutableListOf<Int>()
  val result = mutableList.apply {
    add(17)
    add(42)
    remove(0)
  }
  result eq listOf(17, 42)
  mutableList eq listOf(17, 42)
}
