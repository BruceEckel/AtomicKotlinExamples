// UsingOperators/DestructuringMap.kt
package usingoperators
import atomictest.eq

fun main(args: Array<String>) {
  val map = mapOf("a" to 1)
  for((key, value) in map) {
    key eq "a"
    value eq 1
  }
  // Destructuring assignment compiles to:
  for(entry in map) {
    val key = entry.component1()
    val value = entry.component2()
    key eq "a"
    value eq 1
  }
}
