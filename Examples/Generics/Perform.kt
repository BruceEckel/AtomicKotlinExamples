// Generics/Perform.kt
package generics
import atomictest.eq

fun <T> T.perform(
  f1: T.() -> String,
  f2: T.() -> Boolean,
  f3: T.() -> String
) = "${f1()} ${f2()} ${f3()}"

fun main() {
  val p = Person()
  val d = Dog()
  val r = Robot()
  p.perform(Person::speak, Person::sit,
    Person::chortle) eq "Hi! true Hah!"
  d.perform(Dog::bark, Dog::lieDown,
    Dog::whuff) eq "Ruff! true Whuff!"
  r.perform(Robot::connect, Robot::charge,
    Robot::oil) eq "Beep! true Oiling..."
}
