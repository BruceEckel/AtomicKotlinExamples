// Sequences/DefineTakeIf.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package usingsequences
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
