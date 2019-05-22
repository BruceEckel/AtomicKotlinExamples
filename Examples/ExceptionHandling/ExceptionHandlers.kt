// ExceptionHandling/ExceptionHandlers.kt
package exceptionhandling
import atomictest.eq

fun toss(which: Int) = when (which) {
  1 -> throw Exception1(1)
  2 -> throw Exception2("case 2")
  3 -> throw Exception3("case 3")
  else -> "OK"
}

fun test(which: Int): Any? =
  try {
    toss(which)
  } catch (e: Exception1) {
    e.value
  } catch (e: Exception3) {
    e.message
  } catch (e: Exception2) {
    e.message
  }

fun main() {
  test(0) eq "OK"
  test(1) eq 1
  test(2) eq "case 2"
  test(3) eq "case 3"
}
