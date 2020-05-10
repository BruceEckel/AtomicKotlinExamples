// Interoperability/AnnotateThrows.kt
package checked
import java.io.IOException

@Throws(IOException::class)
fun hasCheckedException() {
  throw IOException()
}
