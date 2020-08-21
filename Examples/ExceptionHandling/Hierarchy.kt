// ExceptionHandling/Hierarchy.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package exceptionhandling
import atomictest.eq

fun testCatchOrder(which: Int) =
  try {
    toss(which)
  } catch (e: Exception2) {    // [1]
    "Handler for Exception2 got ${e.message}"
  } catch (e: Exception3) {    // [2]
    "Handler for Exception3 got ${e.message}"
  }

fun main() {
  testCatchOrder(2) eq
    "Handler for Exception2 got Exception 2"
  testCatchOrder(3) eq
    "Handler for Exception2 got Exception 3"
}
