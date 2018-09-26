// Coroutines/HelloCoroutines.kt
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val coroutine = GlobalScope.launch {
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
