// Coroutines/Jobs.kt
import kotlinx.coroutines.experimental.*

fun main(args: Array<String>) =
runBlocking<Unit> {
  val jobs = List(20) {
    launch {
      delay(1000)
      println("$it")
    }
  }
  jobs.forEach { it.join() }
}
