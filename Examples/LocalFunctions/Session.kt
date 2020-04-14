// LocalFunctions/Session.kt
package localfunctions

class Session(
  val title: String,
  val speaker: String
)

val sessions = listOf(Session(
  "Kotlin Coroutines", "Roman Elizarov"))

val favoriteSpeakers = setOf("Roman Elizarov")
