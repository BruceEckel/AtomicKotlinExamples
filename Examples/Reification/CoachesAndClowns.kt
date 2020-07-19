// Reification/CoachesAndClowns.kt
package reification

import atomictest.eq

class Coach {
  fun funny() = 42
  fun happy() = 24
}

class Clown {
  fun jolly() = 99
  fun happy() = 66
}

fun <T> T.upbeat(f: T.() -> Int) = f()

fun <T> T.elated(
  f: T.() -> Int,
  g: T.() -> Int
) = f() + g()

fun main() {
  Coach().upbeat(Coach::funny) eq 42
  Clown().upbeat(Clown::jolly) eq 99
  Clown().elated(
    Clown::jolly, Clown::happy) eq 165
  Coach().elated(
    Coach::funny, Coach::happy) eq 66
}
