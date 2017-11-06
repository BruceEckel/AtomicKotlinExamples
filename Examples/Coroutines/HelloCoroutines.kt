// Coroutines/HelloCoroutines.kt
import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) =
runBlocking<Unit> {
  val coroutine = launch {
    delay(1000)
    println("Hello")
  }
  coroutine.join()
}
