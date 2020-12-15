// ResourceCleanup/ResourceCleanupSoln1.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package resourceCleanupExercise1
import atomictest.trace
import java.io.File

val text = """
Swing low, sweet chariot
Coming for to carry me home
""".trim()

fun writeAndRead() {
  val f = File("DataFiles/CleanupSoln1.txt")
  if(f.exists())
    f.delete()
  f.createNewFile()
  f.appendText(text)
  trace(f.useLines { it.joinToString("\n") })
  f.forEachLine { trace(it) }
}

fun main() {
  writeAndRead()
  trace eq """
    Swing low, sweet chariot
    Coming for to carry me home
    Swing low, sweet chariot
    Coming for to carry me home
  """
}
