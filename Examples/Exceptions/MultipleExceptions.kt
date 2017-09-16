// Exceptions/MultipleExceptions.kt
import atomictest.eq
import toss.*

fun test(which: Int) =
  try {
    toss(which)
  } catch(e: Except1) {
    "Except1: ${e.why}"
  } catch(e: Except2) {
    "Except2: ${e.n}"
  } catch(e: Except3) {
    "Except3: ${e.msg} ${e.d}"
  }

fun main(args: Array<String>) {
  test(0) eq "OK"
  test(1) eq "Except1: Reason"
  test(2) eq "Except2: 11"
  test(3) eq "Except3: Wanted 1.618"
}
