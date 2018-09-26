// Generics/GenericSpeakers.kt
package generics
import atomictest.eq

// Pass the target object:
fun <T> talkg(spkr: T, spk: T.() -> String) =
  spkr.spk()

// Extension function on the target object:
fun <T> T.talkge(spk: T.() -> String) = spk()

fun main(arg: Array<String>) {
  val person = Person()
  val dog = Dog()
  val robot = Robot()
  // Pass function reference:
  talkg(person, Person::speak) eq "Hi!"
  talkg(dog, Dog::bark) eq "Ruff!"
  talkg(robot, Robot::connect) eq "Beep!"
  // Use extension function:
  person.talkge(Person::speak) eq "Hi!"
  dog.talkge(Dog::bark) eq "Ruff!"
  robot.talkge(Robot::connect) eq "Beep!"
  // Pass a lambda:
  talkg(person) { speak() } eq "Hi!"
  talkg(dog) { bark() } eq "Ruff!"
  talkg(robot) { connect() } eq "Beep!"
  // Use the extension function:
  person.talkge { speak() } eq "Hi!"
  dog.talkge { bark() } eq "Ruff!"
  robot.talkge { connect() } eq "Beep!"
}
