// LazyInitialization/LazyInitSoln1.kt
package lazyinitsoln1
import atomictest.*
import kotlin.reflect.KProperty1

private val trace = Trace()

fun compute(i: Int): Int {
  trace("Compute $i")
  return i
}

class Properties {
  val atDefinition = compute(1)
  val getter
    get() = compute(2)
  val lazyInit by lazy { compute(3) }
  val never by lazy { compute(4) }
}

fun main() {
  val p = Properties()
  fun show(prop: KProperty1<Properties, *>) {
    trace("${prop.name}:")
    trace("${prop.get(p)}")
    trace("${prop.get(p)}")
  }
  show(Properties::atDefinition)
  show(Properties::getter)
  show(Properties::lazyInit)
  show(Properties::never)
  trace eq """
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
    never:
    Compute 4
    4
    4
    """
}
