package experiments

class Dog() {
  fun speak() = "bark!"
}

class Robot() {
  fun speak() = "clank!"
}

//fun <T> talk(t: T) = when {
fun talk(t: Any) = when {
  t is Dog -> t.speak()
  t is Robot -> t.speak()
  else -> ""
}

// fun talk(t: Any, op: () -> String) = op()

fun main(args: Array<String>) {
  val op = Dog::speak
  println(op)
  println(op::class)
  println(op.javaClass.name)
  println(op.javaClass.kotlin)
  println(op::class.javaObjectType)
//  println(talk(Dog(), Dog::speak))
//  println(talk(Robot(), Robot::speak))
}