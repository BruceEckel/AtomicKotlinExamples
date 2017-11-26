// ErrorReporting/ElvisWithException.kt
import atomictest.*

fun maybeNullString(s: String?) =
  s?.length ?:
    throw IllegalArgumentException("s")

fun main(args: Array<String>) {
  maybeNullString("Not a null String") eq 17
  stacktrace1 {
    maybeNullString(null)
  } eq "IllegalArgumentException: s"
}
