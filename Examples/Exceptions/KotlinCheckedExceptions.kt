// Exceptions/KotlinCheckedExceptions.kt
import java.io.*
import atomictest.eq

fun main(args: Array<String>) {
  File("Examples/Exceptions/" +
    "KotlinCheckedExceptions.kt")
    .readLines()[0] eq
    "// Exceptions/KotlinCheckedExceptions.kt"
}
