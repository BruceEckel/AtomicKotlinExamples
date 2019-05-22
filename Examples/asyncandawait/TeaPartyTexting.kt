// asyncandawait/TeaPartyTexting.kt
package asyncandawait

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking(Dispatchers.Default) {
  val marchHare = async {
    println("Can you bring the cake?")
    delay(3000)
    println("Yes, I can bring the cake!")
    "cake"
  }
  val madHatter = async {
    println("Can you bring the treacle?")
    delay(2000)
    println("Yes, I can bring the treacle!")
    "treacle"
  }
  val doorMouse = async {
    println("Can you bring the tea?")
    delay(1000)
    println("Yes, I can bring the tea!")
    "tea"
  }
  println("Alice prepares for the party")
  delay(1500)
  println("Ready for the party")
  println(doorMouse.await())
  println(madHatter.await())
  println(marchHare.await())
}
