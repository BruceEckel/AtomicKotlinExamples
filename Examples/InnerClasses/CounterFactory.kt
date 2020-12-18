// InnerClasses/CounterFactory.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package innerclasses
import atomictest.*

fun interface Counter {
  fun next(): Int
}

object CounterFactory {
  private var count = 0
  fun new(name: String): Counter {
    // Local inner class:
    class Local : Counter {
      init { trace("Local()") }
      override fun next(): Int {
        // Access local identifiers:
        trace("$name $count")
        return count++
      }
    }
    return Local()
  }
  fun new2(name: String): Counter {
    // Instance of an anonymous inner class:
    return object: Counter {
      init { trace("Counter()") }
      override fun next(): Int {
        trace("$name $count")
        return count++
      }
    }
  }
  fun new3(name: String): Counter {
    trace("Counter()")
    return Counter { // SAM conversion
      trace("$name $count")
      count++
    }
  }
}

fun main() {
  fun test(counter: Counter) {
    (0..3).forEach { counter.next() }
  }
  test(CounterFactory.new("Local"))
  test(CounterFactory.new2("Anon"))
  test(CounterFactory.new3("SAM"))
  trace eq """
    Local() Local 0 Local 1 Local 2 Local 3
    Counter() Anon 4 Anon 5 Anon 6 Anon 7
    Counter() SAM 8 SAM 9 SAM 10 SAM 11
  """
}
