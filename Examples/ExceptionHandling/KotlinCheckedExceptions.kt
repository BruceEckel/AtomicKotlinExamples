// ExceptionHandling/KotlinCheckedExceptions.kt
import atomictest.eq
import java.io.File

fun main(args: Array<String>) {
  File("Examples/ExceptionHandling/" +
    "KotlinCheckedExceptions.kt")
    .readLines()[0] eq
    "// ExceptionHandling/KotlinCheckedExceptions.kt"
}
