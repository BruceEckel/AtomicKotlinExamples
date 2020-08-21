// Varargs/VarargLikeList.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun evaluate(vararg ints: Int) {
  println("Size: ${ints.size}")
  println("Sum: ${ints.sum()}")
  println("Min: ${ints.min()}")
  println("Max: ${ints.max()}")
  println("Average: ${ints.average()}")
}

fun main() {
  evaluate(10, -3, 8, 1, 9)
}
/* Output:
Size: 5
Sum: 25
Min: -3
Max: 10
Average: 5.0
*/
