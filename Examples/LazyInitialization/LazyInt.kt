// LazyInitialization/LazyInt.kt

class LazyInt(val init: () -> Int) {
  private var helper: Int? = null
  val value: Int
    get() {
      if (helper == null)
        helper = init()
      return helper!!
    }
}

fun compute(i: Int): Int {
  println("Computing $i")
  return i
}

fun main() {
  val lazyInt = LazyInt { compute(5) }
  println("LazyInt Constructed")
  println("Access 'value' 2x:")
  println(lazyInt.value)
  println(lazyInt.value)
}
/* Output:
LazyInt Constructed
Access 'value' 2x:
Computing 5
5
5
*/
