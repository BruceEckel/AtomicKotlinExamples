// WhenExpressions/BmiWhen.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun bmiMetricOld(
  kg: Double,
  heightM: Double
): String {
  val bmi = kg / (heightM * heightM)
  return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun bmiMetricWithWhen(
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

fun main() {
  bmiMetricOld(72.57, 1.727) eq
    bmiMetricWithWhen(72.57, 1.727)
}
