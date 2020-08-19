// Recursion/CallStack.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package recursion

fun illegalState() {
  // throw IllegalStateException()
}

fun fail() = illegalState()

fun main() {
  fail()
}
