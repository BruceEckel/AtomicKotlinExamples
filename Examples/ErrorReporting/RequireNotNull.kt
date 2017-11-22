// ErrorReporting/RequireNotNull.kt
import atomictest.*

fun maybeNull(n: Int?): Int {
  val n = requireNotNull(n,  // Local shadow
    {"maybeNull(): n cannot be null"})
  return n * 9
}

fun regular(n: Int) = n * 10

fun main(args: Array<String>) {
  val n: Int? = null
  capture {
    maybeNull(n)
  } eq "IllegalArgumentException"
  maybeNull(11) eq 99
  capture {
    regular(requireNotNull(n, {"n is null!"}))
  } eq "IllegalArgumentException"
  regular(7) eq 70
}
