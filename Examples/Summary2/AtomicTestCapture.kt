// Summary2/AtomicTestCapture.kt
import atomictest.*

fun main(args: Array<String>) {
  capture {
    "$1.9".toDouble()
  } eq "NumberFormatException: " +
    """For input string: "$1.9""""
}
