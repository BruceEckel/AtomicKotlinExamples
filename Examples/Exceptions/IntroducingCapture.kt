// Exceptions/IntroducingCapture.kt
import atomictest.*

fun main(args: Array<String>) {
  capture {
    "1$".toInt()
  } eq "NumberFormatException: " +
    """For input string: "1$""""
}
