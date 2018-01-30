// WhenExpressions/BmiWhen.kt
import atomictest.eq

fun getBmiStatusOld(
  kg: Double,
  heightM: Double
): String {
  val bmi = kg / (heightM * heightM)
  return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun getBmiStatusWithWhen(
  kg: Double,
  heightM: Double
): String {
  val bmi = kg / (heightM * heightM)
  return when {
    bmi < 18.5 -> "Underweight"
    bmi < 25 -> "Normal weight"
    else -> "Overweight"
  }
}

fun main(args: Array<String>) {
  getBmiStatusOld(72.57, 1.727) eq
    getBmiStatusWithWhen(72.57, 1.727)
}
