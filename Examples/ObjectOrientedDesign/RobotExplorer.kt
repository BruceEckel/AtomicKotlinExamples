// ObjectOrientedDesign/RobotExplorer.kt
package oodesign
import org.hexworks.zircon.api.*
import org.hexworks.zircon.api.application.*
import org.hexworks.zircon.api.data.*
import org.hexworks.zircon.api.uievent.*
import org.hexworks.zircon.api.graphics.*
import org.hexworks.zircon.api.color.*
import org.hexworks.zircon.api.extensions.*

fun robotExplorer(stage: Stage) {
  val style = StyleSet.defaultStyle()
  // Initialize the Zircon terminal emulator:
  val grid = SwingApplications
    .startTileGrid(AppConfig.newBuilder()
      .withDefaultTileset(
        TrueTypeFontResources.ubuntuMono(25))
      .withSize(Size.create(
        stage.width, stage.height + 1))
      .build()) // +1 for a blank bottom line
  // Strip newlines and create an iterator:
  val maze = stage.maze
    .filter { it != '\n' }.iterator()
  // Fill the grid with the maze:
  grid.size.fetchPositions().forEach {
    if (maze.hasNext())
      grid.putTile(maze.next()
        .toCharacterTile())
  }
  // The robot's location as a Position:
  fun robotPosition() = Position.create(
    stage.robot.room.col,
    stage.robot.room.row)
  // The red robot icon as a layer:
  val robotIcon = grid.addLayer(
    Layer.newBuilder()
      .withSize(Size.one())
      .withOffset(robotPosition())
      .build().apply {
        fill(
          stage.robot.symbol.toCharacterTile(
            style.withForegroundColor(
              ANSITileColor.RED)))
      }
    )
  // Update the character beneath the robot:
  fun updateSymbolAtRobot() {
    grid.cursorPosition = robotPosition()
    grid.putTile(stage.robot
      .room.actor.id().toCharacterTile())
  }
  // Put a string on the blank bottom line:
  fun console(s: String) {
    grid.draw(s.toCharacterTileString(),
      Position.create(1, grid.height - 1))
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
