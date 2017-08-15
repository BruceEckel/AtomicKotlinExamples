// memberFunctions/Cat.kt

class Cat {
  fun meow() = "mew!"
}

fun main(args: Array<String>) {
  val cat = Cat()
  val m1 = cat.meow() // Call 'meow()' for 'cat'
  println(m1)
}
/* Output:
mew!
*/
