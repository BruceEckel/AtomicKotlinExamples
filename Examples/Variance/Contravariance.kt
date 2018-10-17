// Variance/Contravariance.kt
// (Incomplete)
package variance

interface Consume {
  fun consume(gi: GameItem)
}

interface ConsumeCreature : Consume {
  override fun consume(gi: GameItem)
}

interface ConsumePukwudgie : ConsumeCreature {
  override fun consume(gi: GameItem)
}

fun main() {}
