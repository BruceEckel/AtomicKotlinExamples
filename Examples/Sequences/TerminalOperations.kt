// Sequences/TerminalOperations.kt
package sequences

fun main() {
  val list = listOf(1, 2, 3, 4)
  val r = list.asSequence()
    .filter(Int::isEven)
    .map(Int::square)
    .toList()
  println(r)
}
/* Output:
1.isEven()
2.isEven()
2.square()
3.isEven()
4.isEven()
4.square()
[4, 16]
*/
