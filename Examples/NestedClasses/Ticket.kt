// NestedClasses/Ticket.kt
package nestedclasses
import atomictest.eq
import nestedclasses.Ticket.Seat.*

class Ticket(
  val name: String,
  val seat: Seat = COACH
) {
  enum class Seat {
    COACH,
    PREMIUM,
    BUSINESS,
    FIRST
  }
  fun upgrade(): Ticket {
    val newSeat = values()[
      (seat.ordinal + 1)
      .coerceAtMost(FIRST.ordinal)
    ]
    return Ticket(name, newSeat)
  }
  fun meal() = when(seat) {
    COACH -> "Bag Meal"
    PREMIUM -> "Bag Meal with Cookie"
    BUSINESS -> "Hot Meal"
    FIRST -> "Private Chef"
  }
  override fun toString() = "$seat"
}

fun main() {
  val tickets = listOf(
    Ticket("Jerry"),
    Ticket("Summer", PREMIUM),
    Ticket("Squanchy", BUSINESS),
    Ticket("Beth", FIRST)
  )
  tickets.map(Ticket::meal) eq
    "[Bag Meal, Bag Meal with Cookie, " +
    "Hot Meal, Private Chef]"
  tickets.map(Ticket::upgrade) eq
    "[PREMIUM, BUSINESS, FIRST, FIRST]"
  tickets eq
    "[COACH, PREMIUM, BUSINESS, FIRST]"
  tickets.map(Ticket::meal) eq
    "[Bag Meal, Bag Meal with Cookie, " +
    "Hot Meal, Private Chef]"
}
