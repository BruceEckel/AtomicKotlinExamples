// Exceptions/DivZero.kt
package exceptions
import atomictest.*

fun f(i:Int) =
  if(i == 0)
    throw IllegalArgumentException()
  else
    24/i

fun main(args: Array<String>) {
  f(1) eq 24
  capture {
    f(0)
  } eq "IllegalArgumentException"
}
