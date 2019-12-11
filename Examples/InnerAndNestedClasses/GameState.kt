// InnerAndNestedClasses/GameState.kt
interface Game {
  enum class GameState(val isActive: Boolean) {
    ACTIVE(true),
    WON(false),
    LOST(false)
  }

  val state: GameState
}
