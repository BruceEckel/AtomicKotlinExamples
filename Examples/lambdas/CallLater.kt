// lambdas/CallLater.kt
import atomicTest.eq

class Later(val call: () -> String)

fun main(args: Array<String>) {
  val later = Later { "Now" }
  later.call() eq "Now"
}
