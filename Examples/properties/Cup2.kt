// properties/Cup2.kt
import atomicTest.eq

class Cup2 {
  var percentFull = 0
  val max = 100
  fun add(increase: Int): Int {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    return percentFull
  }
}

fun main(args: Array<String>) {
  val cup = Cup2()
  cup.add(50) eq 50
  cup.add(70) eq 100
}
