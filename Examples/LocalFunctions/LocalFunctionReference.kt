// LocalFunctions/LocalFunctionReference.kt
package localfunctions
import atomictest.eq

fun main() {
  fun interesting(session: Session): Boolean {
    if (session.title.contains("Kotlin") &&
      session.speaker in favoriteSpeakers) {
      return true
    }
    // ... more checks
    return false
  }
  sessions.any(::interesting) eq true
}
