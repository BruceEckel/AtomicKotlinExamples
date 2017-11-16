// Coroutines/LaunchManyTimed.kt
import kotlinx.coroutines.experimental.*
import kotlin.system.measureTimeMillis

fun
main(a: Array<String>) = runBlocking<Unit> {
  val duration = measureTimeMillis {
    val jobs = List(19) {
      launch {
        delay(1000)
        print("$it ")
      }
    }
    jobs.forEach { it.join() }
  }
  println("\nDuration: $duration")
}
/* Sample output:
4 6 0 3 1 5 2 8 10 13 14 16 17 18 11 12 7 9 15
Duration: 1020
*/
