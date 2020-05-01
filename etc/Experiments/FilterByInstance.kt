interface Animal
data class Cat(val name: String): Animal
data class Dog(val name: String): Animal

fun main(args: Array<String>) {
    val animals = listOf(
      Cat("Bob"), Dog("Alice"),
      Cat("Zomber"), Dog("Tweet"))
    println(animals.filterIsInstance<Cat>())
    println(animals.filterIsInstance<Dog>())
}
/* Output:
[Cat(name=Bob), Cat(name=Zomber)]
[Dog(name=Alice), Dog(name=Tweet)]
*/
