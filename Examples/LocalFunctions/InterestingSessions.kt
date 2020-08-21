// LocalFunctions/InterestingSessions.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package localfunctions
import atomictest.eq

fun main() {
  sessions.any(
    fun(session: Session): Boolean {    // [1]
      if (session.title.contains("Kotlin") &&
        session.speaker in favoriteSpeakers) {
        return true
      }
      // ... more checks
      return false
    }) eq true
}
