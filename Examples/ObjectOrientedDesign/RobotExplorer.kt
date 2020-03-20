// ObjectOrientedDesign/RobotExplorer.kt
package oodesign
import org.hexworks.zircon.api.*
import org.hexworks.zircon.api.application.*
import org.hexworks.zircon.api.data.*
import org.hexworks.zircon.api.uievent.*
import org.hexworks.zircon.api.graphics.*
import org.hexworks.zircon.api.color.*

fun robotExplorer(stage: Stage) {
  val style = StyleSet.defaultStyle()
  // Turn a character into a Tile:
  fun charTile(c: Char, s: StyleSet = style) =
    Tile.createCharacterTile(c, s)
  // Initialize the zircon terminal emulator:
  val grid = SwingApplications
    .startTileGrid(AppConfig.newBuilder()
      .withDefaultTileset(
        TrueTypeFontResources.ubuntuMono(25))
      .withSize(Size.create(
        stage.width, stage.height + 1))
      .build())
  // Strip newlines and create an iterator:
  val maze = stage.maze
    .filter { it != '\n' }.iterator()
  // Fill the grid with the maze:
  grid.size.fetchPositions().forEach {
    if (maze.hasNext())
      grid.putTile(charTile(maze.next()))
  }
  // The robot's location as a Position:
  fun robotPosition() = Position.create(
    stage.robot.room.col,
    stage.robot.room.row)
  // Create the red robot icon layer:
  val robotIcon = Layer.newBuilder()
    .withSize(Size.one())
    .withOffset(robotPosition())
    .build().apply {
      fill(charTile(stage.robot.symbol,
        style.withForegroundColor(
          ANSITileColor.RED)))
    }
  // As a layer, it can be moved around:
  grid.addLayer(robotIcon)
  // Update the character beneath the robot:
  fun updateSymbolAtRobot() {
    grid.cursorPosition = robotPosition()
    grid.putTile(
      charTile(stage.robot.room.actor.id()))
  }
  // Put a string on the blank bottom line:
  fun console(s: String) {
    grid.cursorPosition =
      Position.create(1, stage.height + 1)
    s.forEach { grid.putTile(charTile(it)) }
  }
  // Move the robot and update the screen:
  fun robotGo(urge: Urge) {
    updateSymbolAtRobot()
    stage.robot.move(urge)
    robotIcon.moveTo(robotPosition())
    console("Energy: ${stage.robot.energy}  ")
  }
  // Respond to the keyboard arrow keys:
  grid.processKeyboardEvents(
    KeyboardEventType.KEY_PRESSED
  ) { event, _ ->
    when (event.code) {
      KeyCode.UP -> robotGo(Urge.North)
      KeyCode.DOWN -> robotGo(Urge.South)
      KeyCode.LEFT -> robotGo(Urge.West)
      KeyCode.RIGHT -> robotGo(Urge.East)
      else -> Pass
    }
  }
}

fun main() {
  robotExplorer(Stage(stringMaze))
}
