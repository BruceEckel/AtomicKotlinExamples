// FunctionReferences/CallLater.kt
import atomictest.eq

class Later(val call: () -> String)

fun main(args: Array<String>) {
  val later = Later { "Now" }
  later.call() eq "Now"
}
