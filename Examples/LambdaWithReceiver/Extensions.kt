// LambdaWithReceiver/Extensions.kt
package lambdawithreceiver
import atomictest.eq

fun fi(lwr: Int.(Int) -> Int) = 10.lwr(20)

fun main(args: Array<String>) {
  fi { this * it } eq 200
  fun Int.ext(n: Int) = this * n
  fi(Int::ext) eq 200
}
