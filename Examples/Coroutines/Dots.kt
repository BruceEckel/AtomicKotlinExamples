// Coroutines/Dots.kt
import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) = runBlocking<Unit> {
  val jobs = List(100_000) {
    launch {
      delay(1000L)
      print(".")
    }
  }
  jobs.forEach { it.join() }
}
