// Coroutines/Sequential.kt
import kotlinx.coroutines.experimental.*
import kotlin.system.measureTimeMillis

suspend fun Task(): Int {
  delay(1000L) // Performing work...
  return 111 // Result of work
}

fun main(args: Array<String>) =
runBlocking<Unit> {
  val time = measureTimeMillis {
    val one = Task()
    val two = Task()
    println("The answer is ${one + two}")
  }
  println("Completed in $time ms")
}
