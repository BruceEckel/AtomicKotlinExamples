// ExceptionsHandling/AnnotateThrows.kt
package checked
import java.io.*

@Throws(IOException::class)
fun hasCheckedException() {
  throw IOException()
}
