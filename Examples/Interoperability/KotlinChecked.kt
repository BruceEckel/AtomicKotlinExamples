// Interoperability/KotlinChecked.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import atomictest.eq
import java.io.File

fun main() {
  File("Examples/Interoperability/" +
    "KotlinChecked.kt")
    .readLines()[0] eq
    "// Interoperability/KotlinChecked.kt"
}
