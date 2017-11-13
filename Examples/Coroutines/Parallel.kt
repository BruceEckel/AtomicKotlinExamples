// Coroutines/Parallel.kt
import kotlinx.coroutines.experimental.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) =
runBlocking<Unit> {
  val time = measureTimeMillis {
    val one = async { Task() }
    val two = async { Task() }
    println("${one.await() + two.await()}")
  }
  println("Completed in $time ms")
}
