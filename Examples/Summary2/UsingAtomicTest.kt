// Summary2/UsingAtomicTest.kt
import atomictest.*

fun main(args: Array<String>) {
  val pi = 3.14
  val pie = "A round dessert"
  pi eq 3.14
  pie eq "A round dessert"
  pi neq pie
}
