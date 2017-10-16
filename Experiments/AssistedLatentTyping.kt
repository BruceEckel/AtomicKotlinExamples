class PerformingDogA {
  fun speak() = println("Woof!")
  fun sit() = println("Sitting")
  fun reproduce() {}
}

class RobotA {
  fun speak() = println("Click!")
  fun sit() = println("Clank!")
  fun oilChange() {}
}

fun <P> perform(performer: P, action1: (P) -> Unit, action2: (P) -> Unit) {
  action1(performer)
  action2(performer)
}

fun main(args: Array<String>) {
  val dog = PerformingDogA()
  val robot = RobotA()
  // with lambdas
  perform(dog, { it.speak() }, { it.sit() })
  perform(robot, { it.speak() }, { it.sit() })
  // with method references
  perform(dog, PerformingDogA::speak, PerformingDogA::sit)
  perform(robot, RobotA::speak, RobotA::sit)
}
