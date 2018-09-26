// ExceptionHandling/GuaranteedCleanup.kt
import atomictest.eq
import toss.*

data class Switch(
  var on: Boolean = false,
  var result: String = "OK"
)

fun testFinally(i: Int): String {
  val sw = Switch()
  try {
    sw.on = true
    toss(i)
  } catch (e: Except1) {
    sw.result = "Except1"
  } catch (e: Except2) {
    sw.result = "Except2"
  } catch (e: Except3) {
    sw.result = "Except3"
  } finally {
    sw.on = false
  }
  sw.on eq false
  return sw.result
}

fun main() {
  testFinally(0) eq "OK"
  testFinally(1) eq "Except1"
  testFinally(2) eq "Except2"
  testFinally(3) eq "Except3"
}
