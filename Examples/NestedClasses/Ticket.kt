// NestedClasses/Ticket.kt
package nestedclasses
import atomictest.eq
import nestedclasses.Ticket.Seat.*

class Ticket(private var seat: Seat = COACH) {
  enum class Seat {
    COACH,
    PREMIUM,
    BUSINESS,
    FIRST
  }
  fun upgrade(): Ticket {
    seat = values()[
      (seat.ordinal + 1)
      .coerceAtMost(FIRST.ordinal)
    ]
    return this
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
    Ticket(),
    Ticket(PREMIUM),
    Ticket(BUSINESS),
    Ticket(FIRST)
  )
  tickets.map(Ticket::meal) eq
    "[Bag Meal, Bag Meal with Cookie, " +
    "Hot Meal, Private Chef]"
  tickets.map(Ticket::upgrade) eq
    "[PREMIUM, BUSINESS, FIRST, FIRST]"
  tickets eq
    "[PREMIUM, BUSINESS, FIRST, FIRST]"
  tickets.map(Ticket::meal) eq
    "[Bag Meal with Cookie, Hot Meal, " +
    "Private Chef, Private Chef]"
}
