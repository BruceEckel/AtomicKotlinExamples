// maps/ReadOnlyMaps.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val m = mapOf(5 to "five", 6 to "six")
  m[5] eq "five"
//  m[5] = "5ive" // Fails
  m + (4 to "four") // Doesn't change m
  m eq mapOf(5 to "five", 6 to "six")
  val m2 = m + (4 to "four")
  m2 eq mapOf(5 to "five", 6 to "six", 4 to "four")
}
