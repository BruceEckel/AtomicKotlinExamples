// WhenExpressions/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package whenExpressionsExercise1
import atomictest.capture
import atomictest.eq

fun cloudiness(cloudPercent: Int): String =
  when (cloudPercent) {
    in 81..100 -> "Cloudy"
    in 61..80 -> "Mostly Cloudy"
    in 41..60 -> "Partly Sunny"
    in 21..40 -> "Mostly Sunny"
    in 0..20 -> "Sunny"
    else -> throw IllegalArgumentException(
      "Cloudiness value should be between 0 and 100")
  }

fun main() {
  cloudiness(100) eq "Cloudy"
  cloudiness(70) eq "Mostly Cloudy"
  cloudiness(50) eq "Partly Sunny"
  cloudiness(30) eq "Mostly Sunny"
  cloudiness(0) eq "Sunny"
  capture {
    cloudiness(1000)
  } eq "IllegalArgumentException: Cloudiness value should be between 0 and 100"
}
