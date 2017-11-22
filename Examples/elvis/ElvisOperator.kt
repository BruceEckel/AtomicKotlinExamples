// Elvis/ElvisOperator.kt
import atomictest.eq

fun what(s: String) = if(s != "b") s else null

fun test(x: String) = what(x) ?: "No $x"

fun main(args: Array<String>) {
  // You can't trick the compiler:
  val s: String? = what("b")
  s eq null

  test("a") eq "a"
  test("b") eq "No b"
}
