// NestedAndInnerClasses/Ticket.kt
package nestedinner
import atomictest.eq
import nestedinner.Ticket.Seat.*

class Ticket(private var seat: Seat = COACH) {
  enum class Seat {
    COACH,
    PREMIUM,
    BUSINESS,
    FIRST
  }
  fun upgrade(): Ticket {
    if(seat.ordinal < values().size - 1) {
      seat = values()[seat.ordinal + 1]
    }
    return this
  }
  override fun toString() = seat.toString()
}

fun main() {
  val tickets = listOf(
    Ticket(),
    Ticket(PREMIUM),
    Ticket(BUSINESS),
    Ticket(FIRST)
  )
  tickets.map(Ticket::upgrade) eq
    "[PREMIUM, BUSINESS, FIRST, FIRST]"
}
