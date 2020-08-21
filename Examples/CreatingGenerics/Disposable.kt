// CreatingGenerics/Disposable.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

interface Disposable {
  val name: String
  fun action(): String
}

class Compost(override val name: String) :
  Disposable {
  override fun action() = "Add to composter"
}

interface Transport : Disposable

class Donation(override val name: String) :
  Transport {
  override fun action() = "Call for pickup"
}

class Recyclable(override val name: String) :
  Transport {
  override fun action() = "Put in bin"
}

class Landfill(override val name: String) :
  Transport {
  override fun action() = "Put in dumpster"
}

val items = listOf(
  Compost("Orange Peel"),
  Compost("Apple Core"),
  Donation("Couch"),
  Donation("Clothing"),
  Recyclable("Plastic"),
  Recyclable("Metal"),
  Recyclable("Cardboard"),
  Landfill("Trash"),
)

val recyclables =
  items.filterIsInstance<Recyclable>()
