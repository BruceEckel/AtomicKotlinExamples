// Sequences/DefineTakeIf.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package sequences
import atomictest.eq

fun <T> T.takeIf(
  predicate: (T) -> Boolean
): T? {
  return if (predicate(this)) this else null
}

fun main() {
  "abc".takeIf { it != "XXX" } eq "abc"
  "XXX".takeIf { it != "XXX" } eq null
}
