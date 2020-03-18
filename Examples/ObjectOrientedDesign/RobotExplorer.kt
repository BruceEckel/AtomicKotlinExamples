// ObjectOrientedDesign/RobotExplorer.kt
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
    .apply { fill(ROBOT_TILE) }
  grid.addLayer(robotIcon)
  fun robotGo(urge: Urge) {
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
  val stage = Stage(stringMaze)
  stage.rooms.forEach { _, room ->
    println(room)
  }
  robotExplorer(stage)
}
