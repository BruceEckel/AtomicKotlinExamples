// Coroutines/HelloCoroutines.kt
import kotlinx.coroutines.*

fun main() =
  runBlocking<Unit> {
    val coroutine = launch {
      delay(10)
      println("Hello,")
    }
    println("World!")
    coroutine.join()
  }
/* Output:
World!
Hello,
*/
