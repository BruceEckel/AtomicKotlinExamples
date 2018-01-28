// LambdaWithReceiver/WithReceiver.kt
package lambdawithreceiver
import atomictest.eq

val tc = TC()
fun f0r(lwr: TC.() -> Int) = tc.lwr()
fun f1r(lwr: TC.(Int) -> Int) = tc.lwr(2)
fun f2r(lwr: TC.(Int, Int) -> Int) =
  tc.lwr(3, 3)
fun f3r(lwr: TC.(Int, Int, Int) -> Int) =
  tc.lwr(4, 4, 4)

fun main(args: Array<String>) {
  f0r(TC::f0) eq 47
  f1r(TC::f1) eq 49
  f2r(TC::f2) eq 150
  f3r(TC::f3) eq 208

/*
  f0r { this + 1 } eq 1
  f1r { it * this } eq 4
  f2r { a, b -> a * b * this } eq 27
  f3r { a, b, c -> this * a + b + c } eq 24
*/
}
