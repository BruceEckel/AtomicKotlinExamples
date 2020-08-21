// LocalFunctions/Session.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package localfunctions

class Session(
  val title: String,
  val speaker: String
)

val sessions = listOf(Session(
  "Kotlin Coroutines", "Roman Elizarov"))

val favoriteSpeakers = setOf("Roman Elizarov")
