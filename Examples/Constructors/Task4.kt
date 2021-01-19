// Constructors/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package constructorsExercise4

class Human(
  val name: String,
  val age: Int
) {
  override fun toString(): String {
    return "Human(name='$name', age=$age)"
  }
}

fun main() {
  val human = Human("Rick", 70)
  println(human)
}
/* Output:
Human(name='Rick', age=70)
*/
