// Overloading/WithDefaultArguments.kt
import atomictest.eq

fun g(n: Int = 0) = n + 373

fun main(args: Array<String>) {
  g() eq 373
}
