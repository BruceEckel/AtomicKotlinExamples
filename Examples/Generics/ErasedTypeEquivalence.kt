// Generics/ErasedTypeEquivalence.kt
import atomictest.eq

fun main() {
  val c1 = listOf<String>()::class
  val c2 = listOf<Int>()::class
  c1 eq c2
}
