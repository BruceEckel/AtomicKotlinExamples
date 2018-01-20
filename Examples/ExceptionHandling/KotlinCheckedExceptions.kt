// ExceptionHandling/KotlinCheckedExceptions.kt
import java.io.*
import atomictest.eq

fun main(args: Array<String>) {
  File("Examples/ExceptionHandling/" +
    "KotlinCheckedExceptions.kt")
    .readLines()[0] eq
    "// ExceptionHandling/KotlinCheckedExceptions.kt"
}
