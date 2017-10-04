open class Animal
class Cat: Animal()

fun main(args: Array<String>) {
  val cats = listOf(Cat(), Cat())
  val animals: List<Animal> = cats
}
