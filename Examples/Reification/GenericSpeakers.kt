// Reification/GenericSpeakers.kt
package reification
import creatinggenerics.*
import atomictest.eq

// Passing the target object:
fun <T> talkg(spkr: T, spk: T.() -> String) =
  spkr.spk()

// Extension function on the target object:
fun <T> T.talkge(spk: T.() -> String) = spk()

// Extension functions:
fun Person.chortle() = "Hah!"
fun Dog.whuff() = "Whuff!"
fun Robot.oil() = "Oiling..."

fun main() {
  val person = Person()
  val dog = Dog()
  val robot = Robot()
  // Pass function reference:
  talkg(person, Person::speak) eq "Hi!"
  talkg(person, Person::chortle) eq "Hah!"
  talkg(dog, Dog::bark) eq "Ruff!"
  talkg(dog, Dog::whuff) eq "Whuff!"
  talkg(robot, Robot::connect) eq "Beep!"
  talkg(robot, Robot::oil) eq "Oiling..."
  // Pass a lambda:
  talkg(person) { speak() } eq "Hi!"
  talkg(person) { chortle() } eq "Hah!"
  talkg(dog) { bark() } eq "Ruff!"
  talkg(dog) { whuff() } eq "Whuff!"
  talkg(robot) { connect() } eq "Beep!"
  talkg(robot) { oil() } eq "Oiling..."
  // Use the generic extension function:
  person.talkge(Person::speak) eq "Hi!"
  person.talkge(Person::chortle) eq "Hah!"
  dog.talkge(Dog::bark) eq "Ruff!"
  dog.talkge(Dog::whuff) eq "Whuff!"
  robot.talkge(Robot::connect) eq "Beep!"
  robot.talkge(Robot::oil) eq "Oiling..."
  // A lambda and the generic extension:
  person.talkge { speak() } eq "Hi!"
  person.talkge { chortle() } eq "Hah!"
  dog.talkge { bark() } eq "Ruff!"
  dog.talkge { whuff() } eq "Whuff!"
  robot.talkge { connect() } eq "Beep!"
  robot.talkge { oil() } eq "Oiling..."
}
