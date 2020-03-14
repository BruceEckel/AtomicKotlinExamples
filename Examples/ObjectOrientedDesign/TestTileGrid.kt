// ObjectOrientedDesign/TestTileGrid.kt
package oodesign
import org.hexworks.zircon.api.*
import org.hexworks.zircon.api.application.*
import org.hexworks.zircon.api.data.Size
import org.hexworks.zircon.api.uievent.*
import org.hexworks.zircon.api.extensions.*

fun main() {
  val grid = SwingApplications
    .startTileGrid(AppConfig.newBuilder()
      .withDefaultTileset(
        TrueTypeFontResources.inconsolata(25))
//        TrueTypeFontResources.ubuntuMono(25))
      .withSize(Size.create(60, 30))
      .build())
  val screen = grid.toScreen()
  screen.addComponent(Components.label()
    .withText(stringMaze)
    .withPosition(5,1))
  screen.display()
  screen.theme = ColorThemes.arc()
  grid.handleKeyboardEvents(KeyboardEventType
    .KEY_PRESSED) { event, _ ->
    println("Keyboard event is: $event")
    Pass
  }
}
