// NestedAndInnerClasses/GameState.kt
package nestedandinner

interface Game {
  enum class State(val active: Boolean) {
    PLAYING(true),
    WON(false),
    LOST(false)
  }
  val state: State
}
