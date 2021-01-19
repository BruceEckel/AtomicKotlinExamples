// Testing/Trace1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.*

fun main() {
  trace("line 1")
  trace(47)
  trace("line 2")
  trace eq """
    line 1
    47
    line 2
  """
}
