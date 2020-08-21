// SealedClasses/UnSealed.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package withoutsealedclasses
import atomictest.eq

open class Transport

data class Train(
  val line: String
): Transport()

data class Bus(
  val number: String,
  val capacity: Int
): Transport()

fun travel(transport: Transport) =
  when (transport) {
    is Train ->
      "Train ${transport.line}"
    is Bus ->
      "Bus ${transport.number}: " +
      "size ${transport.capacity}"
    else -> "$transport is in limbo!"
  }

fun main() {
  listOf(Train("S1"), Bus("11", 90))
    .map(::travel) eq
    "[Train S1, Bus 11: size 90]"
}
