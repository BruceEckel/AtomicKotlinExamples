// forAndRanges/ForWithRanges.kt
fun showRange(r: IntProgression) {
  for (i in r) {
    print("$i ")
  }
  print("// $r")
  println()
}

fun main(args: Array<String>) {
  showRange(1..5)
  showRange(0 until 5)
  showRange(5 downTo 1)           // [1]
  showRange(0..9 step 2)          // [2]
  showRange(0 until 10 step 3)    // [3]
  showRange(9 downTo 2 step 3)
}
/* Output:
1 2 3 4 5 // 1..5
0 1 2 3 4 // 0..4
5 4 3 2 1 // 5 downTo 1 step 1
0 2 4 6 8 // 0..8 step 2
0 3 6 9 // 0..9 step 3
9 6 3 // 9 downTo 3 step 3
*/
