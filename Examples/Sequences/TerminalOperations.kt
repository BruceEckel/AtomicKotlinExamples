// Sequences/TerminalOperations.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package usingsequences
import atomictest.*

fun main() {
  val list = listOf(1, 2, 3, 4)
  trace(list.asSequence()
    .filter(Int::isEven)
    .map(Int::square)
    .toList())
  trace eq """
    1.isEven()
    2.isEven()
    2.square()
    3.isEven()
    4.isEven()
    4.square()
    [4, 16]
  """
}
