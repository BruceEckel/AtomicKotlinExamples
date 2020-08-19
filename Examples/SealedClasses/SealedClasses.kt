// SealedClasses/SealedClasses.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package sealedclasses
import atomictest.eq

sealed class Transport

data class Train(
  val line: String
) : Transport()

data class Bus(
  val number: String,
  val capacity: Int
) : Transport()

fun travel(transport: Transport) =
  when (transport) {
    is Train ->
      "Train ${transport.line}"
    is Bus ->
      "Bus ${transport.number}: " +
      "size ${transport.capacity}"
  }

fun main() {
  listOf(Train("S1"), Bus("11", 90))
    .map(::travel) eq
    "[Train S1, Bus 11: size 90]"
}
