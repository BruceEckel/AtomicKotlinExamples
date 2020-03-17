// ObjectOrientedDesign/ZirconMaze.kt
package oodesign
import org.hexworks.zircon.api.*
import org.hexworks.zircon.api.application.*
import org.hexworks.zircon.api.data.*
import org.hexworks.zircon.api.uievent.*
import org.hexworks.zircon.api.graphics.*
import org.hexworks.zircon.api.color.*

private val ROBOT_TILE = Tile.newBuilder()
  .withForegroundColor(ANSITileColor.RED)
  .withCharacter('R')
  .buildCharacterTile()

fun main() {
  val stage = Stage(stringMaze)
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
  val robot = Layer.newBuilder()
    .withSize(Size.one())
    .withOffset(Position.create(
      stage.robot.room.col,
      stage.robot.room.row))
    .build()
    .apply { fill(ROBOT_TILE) }
  grid.addLayer(robot)

  grid.processKeyboardEvents(
    KeyboardEventType.KEY_PRESSED
  ) { event, _ ->
    when (event.code) {
      KeyCode.UP -> robot.moveUpBy(1)
      KeyCode.DOWN -> robot.moveDownBy(1)
      KeyCode.LEFT -> robot.moveLeftBy(1)
      KeyCode.RIGHT -> robot.moveRightBy(1)
      KeyCode.ESCAPE ->
        robot.moveTo(Position.create(0,0))
      else -> Pass
    }
  }
}
