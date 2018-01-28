// LambdaWithReceiver/TestClass.kt
package lambdawithreceiver
import atomictest.eq

class TC {
  fun f0() = 47
  fun f1(a: Int) = a + f0()
  fun f2(a: Int, b: Int) = f1(a) * b
  fun f3(a: Int, b: Int, c: Int) =
    f2(a, b) + c
}

fun lwr(
  wr0: TC.() -> Int,
  wr1: TC.(Int) -> Int,
  wr2: TC.(Int, Int) -> Int,
  wr3: TC.(Int, Int, Int) -> Int
) {
  val tc = TC()
  tc.wr0() eq 47
  tc.wr1(11) eq 58
  tc.wr2(11, 22) eq 1276
  tc.wr3(11, 22, 33) eq 1309
}

fun main(args: Array<String>) {
  lwr(TC::f0, TC::f1, TC::f2, TC::f3)
}
