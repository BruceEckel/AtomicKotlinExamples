// interoperability/AnnotateThrows.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interop
import java.io.IOException

@Throws(IOException::class)
fun hasCheckedException() {
  throw IOException()
}
