// PropertyDelegation/BigInt.kt
package bigint
import java.math.BigInteger

typealias BigInt = BigInteger

val Int.big: BigInt
  get() = BigInt.valueOf(toLong())

val String.big: BigInt
  get() = BigInt(this)

val zero = BigInt.ZERO
val one = BigInt.ONE
val two = 2.big
