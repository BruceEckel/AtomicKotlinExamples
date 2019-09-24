// Packages/Module2.kt
package module2
import module1.*

val a = 17
internal val m = 4
internal fun g(x: Int) = x * m * m
internal class Boat {
  override fun toString() = "Boat"
}

fun main() {
  println(
    "${module1.a} $a $m ${g(2)} ${Boat()}"
  )
  println(n)
  println(f(10))
  println(Square())
}
/* Output:
9 17 4 32 Boat
10
100
Square
*/
