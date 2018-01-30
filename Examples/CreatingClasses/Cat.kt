// CreatingClasses/Cat.kt

class Cat {
  fun meow() = "mew!"
}

fun main(args: Array<String>) {
  val cat = Cat()
  // Call 'meow()' for 'cat':
  val m1 = cat.meow()
  println(m1)
}
/* Output:
mew!
*/
