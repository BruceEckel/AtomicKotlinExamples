// ScopeFunctions/AndNullability.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions
import atomictest.eq
import kotlin.random.Random

fun gets(): String? =
  if (Random.nextBoolean()) "str!" else null

fun main() {
  gets()?.let {
    it.removeSuffix("!") + it.length
  }?.eq("str4")
}
