// StringConversion/Bicycle.kt
import atomictest.eq

data class Bicycle(val riders: Int)

fun main(args: Array<String>) {
  val forTwo = Bicycle(2)
  forTwo eq "Bicycle(riders=2)"
}
