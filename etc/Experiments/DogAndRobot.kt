interface Speaks {
  val speak: String
}

data class Dog(override val speak: String = "bark!"): Speaks
data class Robot(override val speak: String = "clank!"): Speaks

//inline fun <reified T> talk(t: T) = t.speak
fun talk(t: Speaks) = t.speak

fun main(args: Array<String>) {
  println(talk(Dog()))
  println(talk(Robot()))
}