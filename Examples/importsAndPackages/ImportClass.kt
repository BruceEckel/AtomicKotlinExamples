// importsAndPackages/ImportClass.kt
import java.util.Random

fun main(args: Array<String>) {
  val r = Random(47)
  println(r.nextInt(10))
  println(r.nextInt(10))
  println(r.nextInt(10))
}
/* Output:
8
5
3
*/
