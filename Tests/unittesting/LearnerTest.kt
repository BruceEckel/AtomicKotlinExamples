// Tests/unittesting/LearnerTest.kt
package unittesting
import unittesting.Language.*
import kotlin.test.*

class LearnerTest {
  fun makeLearner(
    id: Int,
    lang: Language = Kotlin,            // [1]
    name: String = "Test Name $id",
    surname: String = "Test Surname $id"
  ) = Learner(id, name, surname, lang)
  @Test
  fun `Single Learner`() {
    val learner = makeLearner(10, Java)
    assertEquals("Test Name 10", learner.name)
  }
  @Test
  fun `Multiple Learners`() {
    val learners = (1..9).map(::makeLearner)
    assertTrue(
      learners.all { it.lang == Kotlin })
  }
}
