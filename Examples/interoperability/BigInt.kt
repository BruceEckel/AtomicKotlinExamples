// interoperability/BigInt.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package biginteger
import java.math.BigInteger

fun Int.toBigInteger(): BigInteger =
  BigInteger.valueOf(toLong())

fun String.toBigInteger(): BigInteger =
  BigInteger(this)

operator fun BigInteger.plus(
  other: BigInteger
): BigInteger = add(other)
