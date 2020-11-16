// Interoperability/BigInt.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package biginteger
import java.math.BigInteger

fun Int.toBigInteger(): BigInteger =
  BigInteger.valueOf(this.toLong())

fun String.toBigInteger(): BigInteger =
  BigInteger(this)

operator fun BigInteger.plus(
  other: BigInteger
): BigInteger = this.add(other)
