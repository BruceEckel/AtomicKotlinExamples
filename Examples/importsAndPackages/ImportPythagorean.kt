// importsAndPackages/ImportPythagorean.kt
import pythagorean.RightTriangle

fun main(args: Array<String>) {
  val rt = RightTriangle()
  println(rt.hypotenuse(3.0, 4.0))
  println(rt.area(3.0, 4.0))
}
/* Output:
5.0
6.0
*/
