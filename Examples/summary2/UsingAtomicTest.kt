// summary2/UsingAtomicTest.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val pi = 3.14
  val pie = "A round dessert"

  pi eq 3.14
  pie eq "A round dessert"
//  pie eq "Square" // Produces error
}
