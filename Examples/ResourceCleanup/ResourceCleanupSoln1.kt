// ResourceCleanup/ResourceCleanupSoln1.kt
package resourcecleanupsoln1
import java.io.File
import atomictest.*

private val t1 = Trace()
private val t2 = Trace()

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
  t1(f.useLines { it.joinToString("\n") })
  f.forEachLine { t2(it) }
}

fun main() {
  writeAndRead()
  t1 eq text
  t2 eq text
}
