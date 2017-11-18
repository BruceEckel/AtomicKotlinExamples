// LazyInitialization/LazyInt.kt
import atomictest.*

class LazyInt(val init: () -> Int) {
  private var helper: Int? = null
  val value: Int
    get() {
      if(helper == null)
        helper = init()
      return helper!!
    }
}

fun compute(i: Int): Int {
  trace("Computing $i")
  return i
}

fun main(args: Array<String>) {
  val lazyInt = LazyInt { compute(5) }
  trace("LazyInt Constructed")
  trace("Access 'value' 2x:")
  trace(lazyInt.value)
  trace(lazyInt.value)
  trace eq """
LazyInt Constructed
Access 'value' 2x:
Computing 5
5
5
"""
}
