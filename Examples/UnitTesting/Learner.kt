// UnitTesting/Learner.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package unittesting

enum class Language {
  Kotlin, Java, Go, Python, Rust, Scala
}

data class Learner(
  val id: Int,
  val name: String,
  val surname: String,
  val language: Language
)
