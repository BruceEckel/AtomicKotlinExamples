// Generics/Perform.kt
package generics
import atomictest.eq

fun <T> T.perform(
  spk: T.() -> String,
  sit: T.() -> Boolean
) = spk() + " " + sit()

fun main() {
  val p = Person()
  val d = Dog()
  val r = Robot()
  p.perform(Person::speak, Person::sit) eq
    "Hi! true"
  d.perform(Dog::bark, Dog::lieDown) eq
    "Ruff! true"
  r.perform(Robot::connect, Robot::charge) eq
    "Beep! true"
}
