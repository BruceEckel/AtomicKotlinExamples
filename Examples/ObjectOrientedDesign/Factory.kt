// ObjectOrientedDesign/Factory.kt
package oodesign
import kotlin.reflect.full.createInstance

object Factory {
  val prototypes: List<Player> =
    Player::class.sealedSubclasses.map {
      it.createInstance()
    }
  // Move through the list, attempting to
  // create an object until you succeed:
  fun make(
    ch: Char, row: Int, col: Int): Room =
    prototypes.map { it.create(ch, row, col) }
      .first { it.success }.room
}
