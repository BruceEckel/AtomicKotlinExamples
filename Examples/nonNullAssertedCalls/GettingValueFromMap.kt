// nonNullAssertedCalls/GettingValueFromMap.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val map = mapOf(1 to "one")
  map[1]!!.toUpperCase() eq "ONE"
  map.getValue(1).toUpperCase() eq "ONE"

  // Throws KotlinNullPointerException:
  map[1]!!.toUpperCase()           // [1]
  // Throws NoSuchElementException:
  map.getValue(1).toUpperCase()    // [2]
}
