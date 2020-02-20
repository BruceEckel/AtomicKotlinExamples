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
    class LocalCounter : Counter {
      init { trace("LocalCounter()") }
      override fun next(): Int {
        trace(name) // Access local
        return count++
      }
    }
    return LocalCounter()
  }
  fun new2(name: String): Counter {
    // Instance of an anonymous inner class:
    return object : Counter {
      init { trace("Counter()") }
      override fun next(): Int {
        trace(name) // Access local
        return count++
      }
    }
  }
}

fun main() {
  val cf = CounterFactory()
  val counter1 = cf.new("Local")
  val counter2 = cf.new2("Anonymous")
  for (i in 0..3)
    trace(counter1.next())
  for (i in 0..3)
    trace(counter2.next())
  trace eq """
  LocalCounter()
  Counter()
  Local
  0
  Local
  1
  Local
  2
  Local
  3
  Anonymous
  4
  Anonymous
  5
  Anonymous
  6
  Anonymous
  7
  """
}
