// sealedClasses/SealedClasses.kt
import atomicTest.eq

sealed class Transport

data class Train(
    val line: String
) : Transport()

data class Bus(
    val number: String,
    val capacity: Int
) : Transport()

fun travel(transport: Transport): String =
    when (transport) {
      is Train ->
        "Train line ${transport.line}"
      is Bus ->
        "Bus number ${transport.number}, size ${transport.capacity}"
    }

fun main(args: Array<String>) {
  val trip = listOf(Train("S1"), Bus("11", 90))
  travel(trip[0]) eq "Train line S1"
  travel(trip[1]) eq "Bus number 11, size 90"
}
