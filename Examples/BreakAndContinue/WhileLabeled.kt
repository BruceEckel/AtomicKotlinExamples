// BreakAndContinue/WhileLabeled.kt
import atomictest.eq

fun main(args: Array<String>) {
  val nums = mutableListOf(0)
  var i = 0
  outer@ while(i < 4) {
    i += 1
    var j = 0
    while(j < 10) {
      j += 1
      if (j == 3) continue@outer
      if (i*j == 15) break@outer
      nums.add(i*j)
    }
  }
  nums eq
  listOf(0, 1, 2, 2, 4, 3, 6, 4, 8)
}
