// ExtensionLambdas/Delta.kt
package extensionlambdas
import atomictest.eq

fun Int.delta1(
  start: (Int) -> Int,
  end: (Int) -> Int,
) = (end(this) - start(this)) * 10

fun Int.delta2(
  start: Int.() -> Int,
  end: Int.() -> Int,
) = (end() - start()) * 10

fun start1(n: Int) = n + 3
fun end1(n: Int) = n + 4
fun Int.start2() = this + 3
fun Int.end2() = this + 4

fun main() {
  74.delta1(::start1, ::end1) eq 10
  74.delta2(::start1, ::end1) eq 10
  74.delta1(Int::start2, Int::end2) eq 10
  74.delta2(Int::start2, Int::end2) eq 10
}
