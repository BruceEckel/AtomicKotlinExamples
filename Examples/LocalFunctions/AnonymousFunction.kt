// LocalFunctions/AnonymousFunction.kt
package anonymousFunctions
import atomictest.eq

class Session(
  val title: String,
  val speaker: String
)

fun main(args: Array<String>) {
  val sessions = listOf(Session(
    "Kotlin in Production", "Christina Lee"))
  val myFavSpeakers = setOf("Christina Lee")

  fun isInteresting(session: Session): Boolean {
    if (session.title.contains("Kotlin") &&
      session.speaker in myFavSpeakers) {
      return true
    }
    // ... more checks
    return false
  }
  sessions.any(::isInteresting) eq true
}
