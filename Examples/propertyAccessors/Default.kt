// PropertyAccessors/Default.kt
import atomictest.*

class Default {
  var i: Int = 0
    get() {              // [1]
      println("get() called")
      return field       // [2]
    }
    set(value) {         // [3]
      println("set($value)")
      field = value      // [4]
    }
}

fun main(args: Array<String>) {
  val d = Default()
  d.i = 2
  d.i eq 2
}
/* Output:
set(2)
get() called
2
*/
