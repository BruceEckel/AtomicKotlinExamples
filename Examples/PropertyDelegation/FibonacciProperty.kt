// PropertyDelegation/FibonacciProperty.kt
import atomictest.eq
import java.math.BigInteger
import kotlin.reflect.KProperty
typealias BigInt = BigInteger

val zero = BigInt.ZERO
val one = BigInt.ONE

val Int.big: BigInt
  get() = BigInt.valueOf(toLong())

val String.big: BigInt
  get() = BigInt(this)

fun fibonacci(n: BigInt): BigInt {
  tailrec fun iterate(nn: BigInt,
    current: BigInt = zero,
    next: BigInt = one): BigInt {
      if(nn == zero)
        return current
      else
        return iterate(
          nn - one, next, current + next)
  }
  assert(n >= zero)
  return iterate(n)
}

class Fibonacci {
  private var current = zero
  operator fun getValue(dgtor: Any?,
    prop: KProperty<*>) = current
  operator fun setValue(dgtor: Any?,
    prop: KProperty<*>, n: BigInt) {
    current = fibonacci(n)
  }
}

fun main(args: Array<String>) {
  var f by Fibonacci()
  f eq 0.big
  f = 22.big
  f eq 17711.big
  f = 100.big
  f eq "354224848179261915075".big
}
