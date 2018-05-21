// Recursion/CallStack.kt
package recursion

fun illegalState() {
  // throw IllegalStateException()
}

fun fail() = illegalState()

fun main(args: Array<String>) {
  fail()
}
