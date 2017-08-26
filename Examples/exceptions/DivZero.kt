// exceptions/DivZero.kt
package exceptions
import atomicTest.eq

class Problem(val msg:String) : Exception(msg)

fun f(i:Int) =
  if(i == 0)
    throw Problem("Divide by zero")
  else
    24/i

fun test(n:Int) =
  try {
    f(n)
  } catch(err: Problem) {
    "Failed: ${err.msg}"
  }

fun main(args: Array<String>) {
  test(4) eq 6
  test(5) eq 4 // Integer truncation
  test(6) eq 4
  test(0) eq "Failed: Divide by zero"
  test(24) eq 1
  test(25) eq 0 // Also truncation
}
