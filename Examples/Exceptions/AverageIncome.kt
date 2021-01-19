// Exceptions/AverageIncome.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package firstversion
import atomictest.*

fun averageIncome(income: Int, months: Int) =
  income / months

fun main() {
  averageIncome(3300, 3) eq 1100
  capture {
    averageIncome(5000, 0)
  } eq "ArithmeticException: / by zero"
}
