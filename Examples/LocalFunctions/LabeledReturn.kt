// LocalFunctions/LabeledReturn.kt
package anonymousFunctions
import atomictest.eq

fun main(args: Array<String>) {
  val sessions = listOf(Session(
    "Kotlin in Production", "Christina Lee"))
  val myFavSpeakers = setOf("Christina Lee")

  sessions.any { session ->
    if (session.title.contains("Kotlin") &&
      session.speaker in myFavSpeakers) {
      return@any true                   // [1]
    }
    // ... more checks
    false
  } eq true
}
