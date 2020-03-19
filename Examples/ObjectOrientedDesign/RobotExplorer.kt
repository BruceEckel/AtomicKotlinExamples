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
  fun charTile(c: Char, s: StyleSet = style) =
    Tile.createCharacterTile(c, s)
  val grid = SwingApplications
    .startTileGrid(AppConfig.newBuilder()
      .withDefaultTileset(
        TrueTypeFontResources.ubuntuMono(25))
      .withSize(Size.create(
        stage.width, stage.height + 1))
      .build())
  val maze = stringMaze
    .filter { it != '\n' }.iterator()
  grid.size.fetchPositions().forEach {
    if (maze.hasNext())
      grid.putTile(charTile(maze.next()))
  }
  fun robotPosition() = Position.create(
    stage.robot.room.col,
    stage.robot.room.row)
  val robotIcon = Layer.newBuilder()
    .withSize(Size.one())
    .withOffset(robotPosition())
    .build().apply {
      fill(charTile(stage.robot.symbol,
        style.withForegroundColor(
          ANSITileColor.RED)))
    }
  grid.addLayer(robotIcon)
  fun updateSymbolAtRobot() {
    grid.cursorPosition = robotPosition()
    grid.putTile(
      charTile(stage.robot.room.actor.id()))
  }
  fun console(s: String) {
    grid.cursorPosition =
      Position.create(1, stage.height + 1)
    s.forEach { grid.putTile(charTile(it)) }
  }
  fun robotGo(urge: Urge) {
    updateSymbolAtRobot()
    stage.robot.move(urge)
    robotIcon.moveTo(robotPosition())
    console("Energy: ${stage.robot.energy}")
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
