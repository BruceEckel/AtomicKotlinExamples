// UnitTesting/TestLearner.kt
package learner
import learner.Language.*
import kotlin.test.Test

fun createLearner(
  id: Int,
  lang: Language = EN,               // [1]
  name: String = "Test Name $id",
  surname: String = "Test Surname $id"
) = Learner(id, name, surname, lang)

class TestLearner {
  @Test
  fun testLearners() {
    // TODO replace with member reference
    // (1..9).map(::createLearner)
    val learners = (1..9).map {
      createLearner(it)
    }
    val learner = createLearner(10, FR)
    // use learners in tests
  }
}
