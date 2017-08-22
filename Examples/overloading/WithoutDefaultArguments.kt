// overloading/WithoutDefaultArguments.kt
import atomicTest.eq

fun f(n: Int) = n + 373
fun f() = f(0)

fun main(args: Array<String>) {
  f() eq 373
}
