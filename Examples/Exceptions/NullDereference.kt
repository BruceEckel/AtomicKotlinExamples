// Exceptions/NullDereference.kt
import atomictest.*

fun main(args: Array<String>) {
  capture {
    null!!
  } eq "KotlinNullPointerException"
}
