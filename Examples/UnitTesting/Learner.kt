// UnitTesting/Learner.kt
package unittesting

enum class Language {
  Kotlin, Java, Go, Python, Rust, Scala
}

data class Learner(
  val id: Int,
  val name: String,
  val surname: String,
  val lang: Language
)
