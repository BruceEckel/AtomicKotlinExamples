// InnerClasses/InnerEx3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package innerClassesExercise3
import atomictest.*

interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}

class Container<T>(
  iterable: Iterable<T>
) : Iterable<T> {
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
    override fun hasNext() = i < items.size
    override fun next(): T = items[i++]
  }
}

fun <T> traceAll(select: Selector<T>) {
  while (!select.end()) {
    trace("${select.current()}")
    select.next()
  }
}

fun <T> traceAll2(ib: Iterable<T>) {
  val iter = ib.iterator()
  while (iter.hasNext())
    trace("${iter.next()}")
}

fun main() {
  traceAll(Container(0..9).selector())
  trace eq "0 1 2 3 4 5 6 7 8 9"
  traceAll2(Container(0..9))
  trace eq "0 1 2 3 4 5 6 7 8 9"
  traceAll(Container(List(10){ it * it })
    .selector())
  trace eq "0 1 4 9 16 25 36 49 64 81"
  traceAll2(Container(List(10){ it * it }))
  trace eq "0 1 4 9 16 25 36 49 64 81"
}
