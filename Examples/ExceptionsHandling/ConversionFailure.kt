// ExceptionsHandling/ConversionFailure.kt
import atomictest.eq

fun main(args: Array<String>) {
  // These fail:
  try {
    "1.234".toInt()
  } catch(e: NumberFormatException) {
    0
  } eq 0
  try {
    "1,234".toInt()
  } catch(e: NumberFormatException) {
    0
  } eq 0
  try {
    "1234 ".toInt()
  } catch(e: NumberFormatException) {
    0
  } eq 0
  // This succeeds:
  try {
    "1234".toInt()
  } catch(e: NumberFormatException) {
    0
  } eq 1234
}
