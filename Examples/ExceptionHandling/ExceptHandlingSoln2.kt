// ExceptionHandling/ExceptHandlingSoln2.kt
package exceptionhandlingsolution2

open class NumberFail : Exception()
open class NoNumber : NumberFail()
open class BadNumber : NumberFail()

fun findNumber(s: String): String {
  var result = ""
  for (c in s)
    if (c in "0123456789.-")
      result += c
    else if (result.isNotEmpty())
      return result
  throw NoNumber()
}

fun convertNumber(s: String): Int =
  try {
    s.toInt()
  } catch (e: NumberFormatException) {
    throw BadNumber()
  }

fun embedNumber(n: Int) = "AbCdE${n}fGhIj"

// All up to here is STARTER CODE
// The learner defines the following two functions:

fun justFail(s: String) =
  try {
    println(embedNumber(
      convertNumber(
        findNumber(s))))
  } catch (e: NumberFail) {
    println("$e")
  }

fun recover(s: String) {
  val ns: String = try {
    findNumber(s)
  } catch (e: NoNumber) {
    "0"
  }
  val n: Int = try {
    convertNumber(ns)
  } catch (e: BadNumber) {
    -1
  }
  println(embedNumber(n))
}

// From here on is STARTER CODE:

fun test(s: String) {
  println("justFail($s)")
  justFail(s)
  println("recover($s)")
  recover(s)
}

fun main() {
  test("The13thFloor9")
  test("NoDigitsHere")
  test("negative-11int")
  test("A float: 3.14159 (pi)")
}

/* Output:
justFail(The13thFloor9)
AbCdE13fGhIj
recover(The13thFloor9)
AbCdE13fGhIj
justFail(NoDigitsHere)
exceptionhandlingsolution2.NoNumber
recover(NoDigitsHere)
AbCdE0fGhIj
justFail(negative-11int)
AbCdE-11fGhIj
recover(negative-11int)
AbCdE-11fGhIj
justFail(A float: 3.14159 (pi))
exceptionhandlingsolution2.BadNumber
recover(A float: 3.14159 (pi))
AbCdE-1fGhIj
 */
