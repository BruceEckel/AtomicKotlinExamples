// Interoperability/AnnotateThrows.kt
package interop
import java.io.IOException

@Throws(IOException::class)
fun hasCheckedException() {
  throw IOException()
}
