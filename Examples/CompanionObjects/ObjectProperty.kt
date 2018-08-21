// CompanionObjects/ObjectProperty.kt
import atomictest.eq

class WithObjectProperty {
  fun increment(): Int {
    n += 1
    return n
  }
  companion object {
    private var n: Int = 0 // Only one
  }
}

fun main(args: Array<String>) {
  val a = WithObjectProperty()
  val b = WithObjectProperty()
  a.increment() eq 1
  b.increment() eq 2
  a.increment() eq 3
}
