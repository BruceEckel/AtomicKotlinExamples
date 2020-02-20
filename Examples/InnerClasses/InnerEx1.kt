// InnerClasses/InnerEx1.kt
package innerclassesex1
import atomictest.*

interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}

class Container<T>(iterable: Iterable<T>): Iterable<T> {
  private val items = iterable.toMutableList()
  fun add(x: T) = items.add(x)
  fun selector() = object : Selector<T> {
    private var i = 0
    override fun end() = i == items.size
    override fun current() = items[i]
    override fun next() {
      if (i < items.size) i++
    }
  }
  override fun iterator() = object : Iterator<T> {
    private var i = 0
    override fun hasNext() = i < items.size - 1
    override fun next(): T = items[++i]
  }
}

fun <T> traceAll(select: Selector<T>): Trace {
  val trace = Trace()
  while (!select.end()) {
    trace + "${select.current()}"
    select.next()
  }
  return trace
}

fun <T> traceAll2(ib: Iterable<T>): Trace {
  val trace = Trace()
  val iter = ib.iterator()
  while (iter.hasNext())
    trace + "${iter.next()}"
  return trace
}

fun main() {
  traceAll(Container(0..9).selector()) eq
  "0 1 2 3 4 5 6 7 8 9"
//  traceAll(Container(List(10) { it * it }).selector()) eq
//  "0 1 2 3 4 5 6 7 8 9"
  traceAll2(Container(0..9)) eq
    "0 1 2 3 4 5 6 7 8 9"
}
