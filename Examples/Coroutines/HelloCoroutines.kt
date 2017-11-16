// Coroutines/HelloCoroutines.kt
import kotlinx.coroutines.experimental.*
import atomictest.*

fun
main(a: Array<String>) = runBlocking<Unit> {
  val coroutine = launch {
    delay(10)
    trace("Hello,")
  }
  trace("World!")
  coroutine.join()
  trace.result eq
"""
World!
Hello,
"""
}
