// InnerClasses/CounterFactory.kt
package innerclasses
import atomictest.*

private val trace = Trace()

interface Counter {
  fun next(): Int
}

class CounterFactory {
  private var count = 0
  fun new(name: String): Counter {
    // A local inner class:
    class Local : Counter {
      init { trace("Local()") }
      override fun next(): Int {
        // Access local identifier:
        trace += "$name $count"
        return count++
      }
    }
    return Local()
  }
  fun new2(name: String): Counter {
    // Instance of an anonymous inner class:
    return object : Counter {
      init { trace("Counter()") }
      override fun next(): Int {
        // Access local identifier:
        trace += "$name $count"
        return count++
      }
    }
  }
}

fun main() {
  fun test(counter: Counter) {
    (0..3).forEach { counter.next() }
    trace.newline()
  }
  val cf = CounterFactory()
  test(cf.new("Local"))
  test(cf.new2("Anon"))
  trace eq """
  Local() Local 0 Local 1 Local 2 Local 3
  Counter() Anon 4 Anon 5 Anon 6 Anon 7
  """
}
