// PropertyAccessors/Counter.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package propertyaccessors
import atomictest.eq

class Counter {
  var value: Int = 0
    private set
  fun inc() = value++
}

fun main() {
  val counter = Counter()
  repeat(10) {
    counter.inc()
  }
  counter.value eq 10
}
