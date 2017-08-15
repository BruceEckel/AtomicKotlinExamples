// creatingClasses/Animals.kt

// Create some classes:
class Giraffe
class Bear
class Hippo

fun main(args: Array<String>) {
  // Create some objects:
  val g1 = Giraffe()
  val g2 = Giraffe()
  val b = Bear()
  val h = Hippo()

  // Each object() is unique:
  println(g1)
  println(g2)
  println(h)
  println(b)
}
/* Sample output:
creatingclasses.Giraffe@279f2327
creatingclasses.Giraffe@2ff4acd0
creatingclasses.Hippo@54bedef2
creatingclasses.Bear@5caf905d
*/
