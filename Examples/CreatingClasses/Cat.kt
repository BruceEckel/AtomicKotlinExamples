// CreatingClasses/Cat.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

class Cat {
  fun meow() = "mrrrow!"
}

fun main() {
  val cat = Cat()
  // Call 'meow()' for 'cat':
  val m1 = cat.meow()
  println(m1)
}
/* Output:
mrrrow!
*/
