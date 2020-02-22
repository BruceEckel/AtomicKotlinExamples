// NestedClasses/WithinInterface.kt
package nestedclasses
import atomictest.*

interface Item {
  val type: Type
  data class Type(val type: String)
}

class Bolt(type: String) : Item {
  override val type = Item.Type(type)
}

fun main() {
  val items = listOf(
    Bolt("Slotted"), Bolt("Hex")
  )
  Trace(items.map(Item::type)) eq
    "[Type(type=Slotted), Type(type=Hex)]"
}
