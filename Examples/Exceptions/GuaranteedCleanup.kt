// exceptions/GuaranteedCleanup.kt
import atomictest.eq

class OnOffException1: Exception()
class OnOffException2: Exception()

data class Switch(var state: Boolean = false,
  var result: String = "OK")

fun canThrow(i: Int) = when(i) {
  1 -> throw OnOffException1()
  2 -> throw OnOffException2()
  else -> Unit
}

fun testFinally(i: Int): String {
  val sw = Switch()
  try {
    sw.state = true
    canThrow(i)
  } catch(e: OnOffException1) {
    sw.result = "OnOffException1"
  } catch(e: OnOffException2) {
    sw.result = "OnOffException2"
  } finally {
    sw.state = false
  }
  sw.state eq false
  return sw.result
}

fun main(args: Array<String>) {
  testFinally(0) eq "OK"
  testFinally(1) eq "OnOffException1"
  testFinally(2) eq "OnOffException2"
}
