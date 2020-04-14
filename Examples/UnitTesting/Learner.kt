// UnitTesting/Learner.kt
package learner

enum class Language {
  EN, FR, DE
}

data class Learner(
  val id: Int,
  val name: String,
  val surname: String,
  val lang: Language
)
