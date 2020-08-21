// Interoperability/AnnotateThrows.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import java.io.IOException

@Throws(IOException::class)
fun hasCheckedException() {
  throw IOException()
}
