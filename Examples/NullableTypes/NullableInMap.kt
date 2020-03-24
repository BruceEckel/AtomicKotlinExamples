// NullableTypes/NullableInMap.kt
import atomictest.eq

fun main() {
  val map = mapOf(0 to "yes", 1 to "no")
  val first: String? = map[0]
  val second: String? = map[2]
  first eq "yes"
  second eq null
}
