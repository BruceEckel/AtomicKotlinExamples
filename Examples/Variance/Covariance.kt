// Variance/Covariance.kt
package variance

interface Create {
  fun makeItem(): GameItem
}

interface CreateCreature : Create {
  override fun makeItem(): Creature
}

interface CreatePukwudgie : CreateCreature {
  override fun makeItem(): Pukwudgie
}

// Fails because Animal is not a subtype
// of Creature:
// interface CreateAnimal : CreateCreature {
//   override fun makeItem(): Animal
// }

fun main() {}
