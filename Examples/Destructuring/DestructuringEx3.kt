// Destructuring/DestructuringEx3.kt
package destructuringex3
import atomictest.eq

fun f() = Pair(true, Pair("Yes", 100))

fun main() {
  // val (ok, (u, v)) = f()
  val (ok, p) = f()
  ok eq true
  val (u, v) = p
  u eq "Yes"
  v eq 100
}
