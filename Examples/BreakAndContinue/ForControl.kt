// BreakAndContinue/ForControl.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val nums = mutableListOf(0)
  for (i in 4 until 100 step 4) { // [1]
    if (i == 8) continue          // [2]
    if (i == 40) break            // [3]
    nums.add(i)
  }                               // [4]
  nums eq "[0, 4, 12, 16, 20, 24, 28, 32, 36]"
}
