// LocalFunctions/ReturnInsideLambda.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package localfunctions
import atomictest.eq

fun main() {
  sessions.any { session ->
    if (session.title.contains("Kotlin") &&
      session.speaker in favoriteSpeakers) {
      return@any true
    }
    // ... more checks
    false
  } eq true
}
