// NullableTypes/NullInMaps.kt
import atomictest.eq

fun main() {
  val map = mapOf(0 to "yes", 1 to "no")
  map[2] eq null
}
