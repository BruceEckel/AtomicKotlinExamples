// Tests/unittesting/LearnerTest.kt
package unittesting
import unittesting.Language.*
import kotlin.test.*

fun makeLearner(
  id: Int,
  lang: Language = Kotlin,            // [1]
  name: String = "Test Name $id",
  surname: String = "Test Surname $id"
) = Learner(id, name, surname, lang)

class LearnerTest {
  @Test
  fun `single Learner`() {
    val learner = makeLearner(10, Java)
    assertEquals("Test Name 10", learner.name)
  }
  @Test
  fun `multiple Learners`() {
    val learners = (1..9).map(::makeLearner)
    assertTrue(
      learners.all { it.lang == Kotlin })
  }
}
