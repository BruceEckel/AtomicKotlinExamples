// Summary2/Boxes.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summary2
import atomictest.*

private var count = 0                   // [1]

private class Box(val dimension: Int) { // [2]
  fun volume() =
    dimension * dimension * dimension
  override fun toString() =
    "Box volume: ${volume()}"
}

private fun countBox(box: Box) {        // [3]
  trace("$box")
  count++
}

fun countBoxes() {
  countBox(Box(4))
  countBox(Box(5))
}

fun main() {
  countBoxes()
  trace("$count boxes")
  trace eq """
    Box volume: 64
    Box volume: 125
    2 boxes
  """
}
