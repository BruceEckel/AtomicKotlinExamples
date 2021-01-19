// HigherOrderFunctions/RepeatByInt.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  repeat(4) { trace("hi!") }
  trace eq "hi! hi! hi! hi!"
}
