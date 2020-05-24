// UnitTesting/TestLearner.kt
package unittesting
import unittesting.Language.*
import kotlin.test.Test
import kotlin.test.assertEquals

fun makeLearner(
  id: Int,
  lang: Language = Kotlin,         // [1]
  name: String = "Test Name $id",
  surname: String = "Test Surname $id"
) = Learner(id, name, surname, lang)

class TestLearner {
  @Test
  fun testLearners() {
    val learners =
      (1..9).map(::makeLearner)
    val learner = makeLearner(10, Java)
    assertEquals("", learner)
  }
}
