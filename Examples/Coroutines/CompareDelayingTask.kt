// Coroutines/CompareDelayingTask.kt
import atomictest.eq
import kotlinx.coroutines.experimental.*
import kotlin.system.measureTimeMillis

suspend fun task(): Int {
  delay(1000L) // Performing work...
  return 111   // Result of work
}

fun sequentialTasks() = runBlocking<Double> {
  measureTimeMillis {
    val result =
      List(5) { task() }.sumBy { it }
    result eq 555
  }.toDouble()
}

fun parallelTasks() = runBlocking<Double> {
  measureTimeMillis {
    val result =
      List(5) { async { task() } }
        .sumBy { it.await() }
    result eq 555
  }.toDouble()
}

// Simple round to two decimal places:
fun round2dp(d: Double) =
  Math.round(d * 100) / 100.0

fun main(args: Array<String>) {
  val seq = sequentialTasks()
  val par = parallelTasks()
  println("Ratio: ${round2dp(seq / par)}")
}
/* Sample output:
555
555
Ratio: 4.88
*/
