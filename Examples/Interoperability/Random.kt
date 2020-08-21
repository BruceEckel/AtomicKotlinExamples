// Interoperability/Random.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import atomictest.eq
import java.util.Random

fun main() {
  val rand = Random(47)
  rand.nextInt(100) eq 58
}
