// CollectionsAndJava/ReadOnlyCollections.kt
import atomictest.eq

fun main() {
  val mutableList = mutableListOf(1, 2, 3)
  // Read-only reference to a mutable list:
  val list: List<Int> = mutableList
  mutableList += 4
  // list has changed:
  list eq "[1, 2, 3, 4]"
}
