// ObjectOrientedDesign/TestFactory.kt
package robotexplorer
import atomictest.eq

fun main() {
  Stage(stringMaze).mazeView() eq stringMaze
}
