// FunctionTypes/FunctionTypeExamples.kt
fun main(args: Array<String>) {
  val helloWorld: () -> Unit =
    { println("Hello, world!") }
  helloWorld()

  val sum: (Int, Int) -> Int =
    { x, y -> x + y }
  println(sum(1, 2))
}
/* Output:
Hello, world!
3
*/
