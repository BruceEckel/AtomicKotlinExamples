// OperatorOverloading/ConfusingPrecedence.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

fun main() {
  val x: Int? = 1
  val y: Int = 2
  val sum = x ?: 0 + y
  sum eq 1
  (x ?: 0) + y eq 3    // [1]
  x ?: (0 + y) eq 1    // [2]
}
