// ErrorReporting/ElvisWithException.kt
import atomictest.*

class ElvisException(m: String): Exception(m)

fun maybeNullString(s: String?) =
  s?.length ?:
    throw ElvisException("s cannot be null")

fun main(args: Array<String>) {
  maybeNullString("Not a null String") eq 17
  stacktrace1 {
    maybeNullString(null)
  } eq "ElvisException: s cannot be null"
}
