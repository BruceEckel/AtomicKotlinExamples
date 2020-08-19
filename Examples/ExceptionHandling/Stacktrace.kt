// ExceptionHandling/Stacktrace.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package stacktrace
import exceptionhandling.Exception1

fun function1(): Int =
  throw Exception1(-52)

fun function2() = function1()

fun function3() = function2()

fun main() {
//  function3()
}
