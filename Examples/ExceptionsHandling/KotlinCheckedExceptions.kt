// ExceptionsHandling/KotlinCheckedExceptions.kt
import java.io.*
import atomictest.eq

fun main(args: Array<String>) {
  File("Examples/ExceptionsHandling/" +
    "KotlinCheckedExceptions.kt")
    .readLines()[0] eq
    "// ExceptionsHandling/KotlinCheckedExceptions.kt"
}
