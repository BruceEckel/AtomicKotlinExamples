// Exceptions/AverageIncomeWithNull.kt
package withnull
import atomictest.eq

fun averageIncome(income: Int, months: Int) =
  if (months == 0)
    null
  else
    income / months

fun main(args: Array<String>) {
  averageIncome(3300, 3) eq 1100
  averageIncome(5000, 0) eq null
}
