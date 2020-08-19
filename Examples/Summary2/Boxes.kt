// Summary2/Boxes.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.

private var count = 0                   // [1]

private class Box(val dimension: Int) { // [2]
  fun volume() =
    dimension * dimension * dimension
  override fun toString() =
    "Box volume: ${volume()}"
}

private fun countBox(box: Box) {        // [3]
  println("$box")
  count++
}

fun countBoxes() {
  countBox(Box(4))
  countBox(Box(5))
}

fun main() {
  countBoxes()
  println("$count boxes")
}
/* Output:
Box volume: 64
Box volume: 125
2 boxes
*/
