// ObjectOrientedDesign/RobotExplorer.kt
package oodesign
import org.hexworks.zircon.api.*
import org.hexworks.zircon.api.application.*
import org.hexworks.zircon.api.data.*
import org.hexworks.zircon.api.uievent.*
import org.hexworks.zircon.api.graphics.*
import org.hexworks.zircon.api.color.*

private val robotTile = Tile.newBuilder()
  .withForegroundColor(ANSITileColor.RED)
  .withCharacter('R')
  .buildCharacterTile()

fun robotExplorer(stage: Stage) {
  val grid = SwingApplications
    .startTileGrid(AppConfig.newBuilder()
      .withDefaultTileset(
        TrueTypeFontResources.ubuntuMono(25))
      .withSize(Size.create(
        stage.width, stage.height))
      .build())
  val maze = stringMaze
    .filter { it != '\n' }.iterator()
  grid.size.fetchPositions().forEach {
    grid.putTile(
      Tile.createCharacterTile(maze.next(),
        StyleSet.defaultStyle())
    )
  }
  fun robotPosition() = Position.create(
    stage.robot.room.col,
    stage.robot.room.row)
  val robotIcon = Layer.newBuilder()
    .withSize(Size.one())
    .withOffset(robotPosition())
    .build()
    .apply { fill(robotTile) }
  grid.addLayer(robotIcon)
  fun updateCharAtRobot() {
    val tile = Tile.newBuilder()
      .withCharacter(
        stage.robot.room.agent.id())
      .buildCharacterTile()
    grid.cursorPosition = robotPosition()
    grid.putTile(tile)
  }
  fun robotGo(urge: Urge) {
    updateCharAtRobot()
    stage.robot.move(urge)
    robotIcon.moveTo(robotPosition())
  }
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
