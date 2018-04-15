// Constructors/Arg.kt

class Alien(name: String) {
  val greeting = "Poor $name!"
}

fun main(args: Array<String>) {
  val alien = Alien("Mr.Meeseeks")
  println(alien.greeting)
  // alien.name // Error     // [2]
}
/* Output:
Poor Mr.Meeseeks!
*/
