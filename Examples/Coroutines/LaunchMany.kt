// Coroutines/LaunchMany.kt
import kotlinx.coroutines.experimental.*

fun
main(a: Array<String>) = runBlocking<Unit> {
  val jobs = List(19) {
    launch {
      delay(1000)
      print("$it ")
    }
  }
  jobs.forEach { it.join() }
}
/* Sample output:
6 1 10 7 2 4 9 12 13 14 15 17 16 18 3 0 5 11 8
*/
