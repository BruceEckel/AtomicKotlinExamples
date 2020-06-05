// UsingOperators/OperatorPlus.kt
import atomictest.eq

fun main() {
  val mutableList = mutableListOf(1, 2, 3)
  mutableList += 4  // operator plusAssign()
  mutableList.plusAssign(5) // Explicit
  mutableList eq "[1, 2, 3, 4, 5]"
  val list = listOf(1)  // Read-only
  val newList = list + 2  // operator plus()
  list eq "[1]"
  newList eq "[1, 2]"
  val another = list.plus(3)  // Explicit
  another eq "[1, 3]"
}
