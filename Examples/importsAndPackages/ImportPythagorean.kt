// ImportsAndPackages/ImportPythagorean.kt
import pythagorean.RightTriangle

fun main(args: Array<String>) {
  val rt = RightTriangle(3.0, 4.0)
  println(rt.hypotenuse())
  println(rt.area())
}
/* Output:
5.0
6.0
*/
