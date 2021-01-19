// Summary2/Task6.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIIExercise6
import atomictest.eq

class Temperature {
  private var current = 0.0
  private var scale = "f"

  var fahrenheit: Double
    set(now) {
      current = now
      scale = "f"
    }
    get(): Double =
      if (scale == "f")
        current
      else
        current * 9.0 / 5.0 + 32.0

  var celsius: Double
    set(now) {
      current = now
      scale = "c"
    }
    get(): Double =
      if (scale == "c")
        current
      else
        (current - 32.0) * 5.0 / 9.0
}

fun main() {
  val temp = Temperature()
  temp.fahrenheit = 98.6
  temp.fahrenheit eq 98.6
  temp.celsius eq 37.0
  temp.celsius = 100.0
  temp.fahrenheit eq 212.0
}
