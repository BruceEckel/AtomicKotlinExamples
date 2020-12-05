// Upcasting/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package upcastingExercise2
import atomictest.eq

interface Apple {
  fun consume(): String
}

class GrannySmith : Apple {
  override fun consume() = "chomp GrannySmith"
}

class Gala : Apple {
  override fun consume() = "bite Gala"
}

class Fuji : Apple {
  override fun consume() = "press Fuji"
}

class Braeburn : Apple {
  override fun consume() = "peel Braeburn"
}

fun main() {
  val apples = listOf(
    GrannySmith(),
    Gala(),
    Fuji(),
    Braeburn()
  )
  apples.map { it.consume() } eq
    "[chomp GrannySmith, " +
    "bite Gala, press Fuji, peel Braeburn]"
}
