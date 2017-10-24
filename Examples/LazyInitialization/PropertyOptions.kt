// LazyInitialization/PropertyOptions.kt
package LazyInitialization
import atomictest.*

fun compute(i: Int): Int {
  trace("Compute $i")
  return i
}

class Properties {
  val atDefinition = compute(1)
  val getter
    get() = compute(2)
  val lazyInit by lazy { compute(3) }
}

fun main(args: Array<String>) {
  trace("Properties():")
  val p = Properties()
  trace("atDefinition:")
  trace(p.atDefinition)
  trace(p.atDefinition)
  trace("getter:")
  trace(p.getter)
  trace(p.getter)
  trace("lazyInit:")
  trace(p.lazyInit)
  trace(p.lazyInit)
  trace.result eq """
Properties():
Compute 1
atDefinition:
1
1
getter:
Compute 2
2
Compute 2
2
lazyInit:
Compute 3
3
3
"""
}
