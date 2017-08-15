// summary1/BasicFunctions.kt
fun cube(x: Int): Int {
  return x * x * x
}

fun bang(s: String) = s + "!"

fun main(args: Array<String>) {
  println(cube(3))
  println(bang("pop"))
}
/* Output:
27
pop!
*/
