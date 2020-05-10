// Interoperability/KotlinChecked.kt
import atomictest.eq
import java.io.File

fun main() {
  File("Examples/Interoperability/" +
    "KotlinChecked.kt")
    .readLines()[0] eq
    "// Interoperability/KotlinChecked.kt"
}
