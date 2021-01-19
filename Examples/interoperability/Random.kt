// interoperability/Random.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq
import java.util.Random

fun main() {
  val rand = Random(47)
  rand.nextInt(100) eq 58
}
