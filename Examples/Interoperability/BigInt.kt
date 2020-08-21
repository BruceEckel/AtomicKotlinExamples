// Interoperability/BigInt.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package bigint
import java.math.BigInteger

typealias BigInt = BigInteger

val Int.big: BigInt
  get() = BigInt.valueOf(toLong())

val String.big: BigInt
  get() = BigInt(this)

val zero = BigInt.ZERO
val one = BigInt.ONE
