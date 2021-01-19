// OperatorOverloading/Invoke.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

class Func {
  operator fun invoke() = "invoke()"
  operator fun invoke(i: Int) = "invoke($i)"
  operator fun invoke(i: Int, j: String) =
    "invoke($i, $j)"
  operator fun invoke(
    i: Int, j: String, k: Double
  ) = "invoke($i, $j, $k)"
}

fun main() {
  val f = Func()
  f() eq "invoke()"
  f(22) eq "invoke(22)"
  f(22, "Hi") eq "invoke(22, Hi)"
  f(22, "Three", 3.1416) eq
    "invoke(22, Three, 3.1416)"
}
