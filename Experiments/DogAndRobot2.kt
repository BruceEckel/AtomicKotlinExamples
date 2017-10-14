package experiments

data class Dog(val speak: String = "bark!")
data class Robot(val speak: String = "clank!")

//fun <T> talk(t: T) = when {
fun talk(t: Any) = when {
  t is Dog -> t.speak
  t is Robot -> t.speak
  else -> ""
}

fun main(args: Array<String>) {
  println(talk(Dog()))
  println(talk(Robot()))
}