// ObjectOrientedDesign/TestTileGrid.kt
package oodesign
import org.hexworks.zircon.api.*
import org.hexworks.zircon.api.application.*
import org.hexworks.zircon.api.data.Size
import org.hexworks.zircon.api.uievent.*

fun main() {
  val grid = SwingApplications
    .startTileGrid(AppConfig.newBuilder()
      .withDefaultTileset(
        CP437TilesetResources.rogueYun16x16())
      .withSize(Size.create(40, 20))
      .build())
  grid.handleKeyboardEvents(KeyboardEventType
    .KEY_PRESSED) { event, _ ->
    println("Keyboard event is: $event")
    Pass
  }
}
