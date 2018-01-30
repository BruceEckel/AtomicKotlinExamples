// ClassArguments/ClassArg.kt

class Alien(name: String) {
  val greeting = "Poor $name!"
}

fun main(args: Array<String>) {
  val alien = Alien("Mr.Meeseeks")
  println(alien.greeting)
  // alien.name // Error
}
/* Output:
Poor Mr.Meeseeks!
*/
