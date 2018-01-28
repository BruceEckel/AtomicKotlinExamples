// SafeCalls/SafeOperation.kt
import atomictest.eq

fun String.echo() = "$this"

fun check(s: String?) = s?.echo() eq s

fun main(args: Array<String>) {
  check("Howdy")
  check(null)
}
