// NestedClasses/Ticket.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package nestedclasses
import atomictest.eq
import nestedclasses.Ticket.Seat.*

class Ticket(
  val name: String,
  val seat: Seat = Coach
) {
  enum class Seat {
    Coach,
    Premium,
    Business,
    First
  }
  fun upgrade(): Ticket {
    val newSeat = values()[
      (seat.ordinal + 1)
      .coerceAtMost(First.ordinal)
    ]
    return Ticket(name, newSeat)
  }
  fun meal() = when(seat) {
    Coach -> "Bag Meal"
    Premium -> "Bag Meal with Cookie"
    Business -> "Hot Meal"
    First -> "Private Chef"
  }
  override fun toString() = "$seat"
}

fun main() {
  val tickets = listOf(
    Ticket("Jerry"),
    Ticket("Summer", Premium),
    Ticket("Squanchy", Business),
    Ticket("Beth", First)
  )
  tickets.map(Ticket::meal) eq
    "[Bag Meal, Bag Meal with Cookie, " +
    "Hot Meal, Private Chef]"
  tickets.map(Ticket::upgrade) eq
    "[Premium, Business, First, First]"
  tickets eq
    "[Coach, Premium, Business, First]"
  tickets.map(Ticket::meal) eq
    "[Bag Meal, Bag Meal with Cookie, " +
    "Hot Meal, Private Chef]"
}
