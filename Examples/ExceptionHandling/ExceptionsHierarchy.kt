// ExceptionHandling/ExceptionsHierarchy.kt
package exceptionhandling
import atomictest.eq

fun testCatchOrder(which: Int) =
  try {
    toss(which)
  } catch (e: Exception2) {    // [1]
    "Exception2: ${e.message}"
  } catch (e: Exception3) {    // [2]
    "Exception3: ${e.message}"
  }

fun main() {
  testCatchOrder(3) eq
    "Exception2: case 3"
}
