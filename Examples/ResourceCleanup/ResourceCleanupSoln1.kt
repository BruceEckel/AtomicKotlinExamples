// ResourceCleanup/ResourceCleanupSoln1.kt
package resourcecleanupsoln1
import java.io.File

val text = """
Swing low, sweet chariot
Coming for to carry me home
""".trim()

fun writeAndRead() {
  val f = File("Soln1.txt")
  if(f.exists())
    f.delete()
  f.createNewFile()
  f.appendText(text)
  println(f.useLines { it.joinToString("\n") })
  f.forEachLine { println(it) }
}

fun main() {
  writeAndRead()
}
/* Output:
Swing low, sweet chariot
Coming for to carry me home
Swing low, sweet chariot
Coming for to carry me home
 */
