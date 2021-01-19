// ManipulatingLists/PlayingCards.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package manipulatinglists
import kotlin.random.Random
import atomictest.*

enum class Suit {
  Spade, Club, Heart, Diamond
}

enum class Rank(val faceValue: Int) {
  Ace(1), Two(2), Three(3), Four(4), Five(5),
  Six(6), Seven(7), Eight(8), Nine(9),
  Ten(10), Jack(10), Queen(10), King(10)
}

class Card(val rank: Rank, val suit: Suit) {
  override fun toString() =
    "$rank of ${suit}s"
}

val deck: List<Card> =
  Suit.values().flatMap { suit ->
    Rank.values().map { rank ->
      Card(rank, suit)
    }
  }

fun main() {
  val rand = Random(26)
  repeat(7) {
    trace("'${deck.random(rand)}'")
  }
  trace eq """
    'Jack of Hearts' 'Four of Hearts'
    'Five of Clubs' 'Seven of Clubs'
    'Jack of Diamonds' 'Ten of Spades'
    'Seven of Spades'
  """
}
