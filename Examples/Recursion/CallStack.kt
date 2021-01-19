// Recursion/CallStack.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package recursion

fun illegalState() {
  // throw IllegalStateException()
}

fun fail() = illegalState()

fun main() {
  fail()
}
