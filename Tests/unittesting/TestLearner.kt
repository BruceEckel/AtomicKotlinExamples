// UnitTesting/TestLearner.kt
package unittesting
import unittesting.Language.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun makeLearner(
  id: Int,
  lang: Language = Kotlin,         // [1]
  name: String = "Test Name $id",
  surname: String = "Test Surname $id"
) = Learner(id, name, surname, lang)

class TestLearner {
  @Test
  fun testLearners() {
    val learner = makeLearner(10, Java)
    assertEquals("Test Name 10", learner.name)
    val learners = (1..9).map(::makeLearner)
    assertTrue(
      learners.all { it.lang == Kotlin })
  }
}
