// Logging/LoggingSoln1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package loggingExercise1
import atomictest.*
import atomiclog.Logger

class Level(
  val range: IntRange,
  private var level: Int = range.start
) {
  init {
    require(level in range) {
      "Initial level out of range: $level"
    }
  }
  val value: Int
    get() = level
  fun up(): Int {
    if (level + 1 in range)
      level++
    return level
  }
  fun down(): Int {
    if (level - 1 in range)
      level--
    return level
  }
  fun set(new: Int) {
    require(new in range) {
      "set() argument out of range: $new"
    }
    level = new
  }
}

class Pipe(val level: Level = Level(0..10)) {
  val logger = Logger("PipeLog.txt")
  fun checkLevel() {
    when(level.value) {
      2 -> logger.trace("Level 2")
      4 -> logger.debug("Level 4")
      6 -> logger.info("Level 6")
      8 -> logger.warn("Level 8")
      10 -> logger.error("Level 10")
    }
  }
}

fun main() {
  val pipe = Pipe()
  (0..10).forEach {
    pipe.level.up()
    pipe.checkLevel()
  }
  pipe.logger.logFile.readText() eq
  """
  Trace: Level 2
  Debug: Level 4
  Info: Level 6
  Warn: Level 8
  Error: Level 10
  Error: Level 10
  """
}
