// ExceptionHandling/KotlinChecked.kt
import atomictest.eq
import java.io.File

fun main() {
  File("Examples/ExceptionHandling/" +
    "KotlinChecked.kt")
    .readLines()[0] eq
    "// ExceptionHandling/KotlinChecked.kt"
}
