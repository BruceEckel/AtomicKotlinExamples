// Summary2/ColorSet.kt
import atomictest.eq

val colors = """
  Yellow Red Blue Green Orange Cyan
""".split(Regex("\\W+")).sorted()      // [1]

fun main(args: Array<String>) {
  println(colors)
  val iSet = colors.toSet() - ""       // [2]
  println(iSet)
  println(iSet + iSet)                 // [3]
  val mSet = iSet.toMutableSet()       // [4]
  mSet += colors.slice(3..5)           // [5]
  println(mSet)
  // Set membership:
  println("Red" in iSet)               // [6]
  println(iSet.contains("Chartreuse"))
}
/* Output:
[, , Blue, Cyan, Green, Orange, Red, Yellow]
[Blue, Cyan, Green, Orange, Red, Yellow]
[Blue, Cyan, Green, Orange, Red, Yellow]
[Blue, Cyan, Green, Orange, Red, Yellow]
true
false
*/
