// LocalFunctions/InterestingSessions.kt
package localfunctions
import atomictest.eq

fun main(args: Array<String>) {
  val sessions = listOf(Session(
    "Kotlin in Production", "Christina Lee"))
  val myFavSpeakers = setOf("Christina Lee")

  sessions.any(
    fun(session: Session): Boolean {    // [1]
      if (session.title.contains("Kotlin") &&
        session.speaker in myFavSpeakers) {
        return true                     // [2]
      }
      // ... more checks
      return false                      // [3]
    }) eq true
}
