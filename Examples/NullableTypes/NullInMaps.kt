// NullableTypes/NullInMaps.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val map = mapOf(0 to "yes", 1 to "no")
  map[2] eq null
}
