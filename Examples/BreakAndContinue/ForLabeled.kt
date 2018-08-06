// BreakAndContinue/ForLabeled.kt
import atomictest.eq

fun main(args: Array<String>) {
  val nums = mutableListOf(0)
  outer@ for(i in 0..4) {
    for(j in 1..10) {
      if (j == 3) continue@outer
      if (i*j == 15) break@outer
      nums.add(i*j)
    }
  }
  nums eq
  listOf(0, 0, 0, 1, 2, 2, 4, 3, 6, 4, 8)
}
