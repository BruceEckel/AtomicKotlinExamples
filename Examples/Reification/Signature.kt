// Reification/Signature.kt
package reification
import atomictest.eq

fun f(g: (Int, Double) -> Double) = g(1, 2.0)

fun fl() = f { n, d -> n * d }

fun v(n: Int, d: Double) = n * d
fun w(n: Int, d: Double) = n + d

fun fv() = f(::v)
fun fw() = f(::w)

fun fy() = f(fun(n: Int, d: Double) = n * d)

fun main() {
  fl() eq 2.0
  fv() eq 2.0
  fw() eq 3.0
  fy() eq 2.0
}
