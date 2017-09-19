// Exceptions/DivZero2.kt
import atomictest.*

fun main(args: Array<String>) {
  capture {
    1/0
  } eq "ArithmeticException"
}
