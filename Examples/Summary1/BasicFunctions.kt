// Summary1/BasicFunctions.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

fun cube(x: Int): Int {
  return x * x * x
}

fun bang(s: String) = s + "!"

fun main() {
  println(cube(3))
  println(bang("pop"))
}
/* Output:
27
pop!
*/
