// LocalFunctions/InterestingSessions.kt
package localfunctions
import atomictest.eq

fun main() {
  sessions.any(
    fun(session: Session): Boolean {    // [1]
      if (session.title.contains("Kotlin") &&
        session.speaker in myFavSpeakers) {
        return true
      }
      // ... more checks
      return false
    }) eq true
}
