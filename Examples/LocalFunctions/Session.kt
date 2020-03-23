// LocalFunctions/Session.kt
package localfunctions

class Session(
  val title: String,
  val speaker: String
)

val sessions = listOf(Session(
  "Kotlin in Production", "Christina Lee"))

val favoriteSpeakers = setOf("Christina Lee")
