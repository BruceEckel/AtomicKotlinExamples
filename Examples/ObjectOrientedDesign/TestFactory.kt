// ObjectOrientedDesign/TestFactory.kt
package oodesign
import atomictest.eq

fun main() {
  Stage(stringMaze).mazeView() eq stringMaze
}
