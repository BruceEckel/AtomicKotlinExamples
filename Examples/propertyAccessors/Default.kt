// PropertyAccessors/Default.kt
import atomictest.*

class Default {
  var i: Int = 0
    get() {
      println("get() called")
      return field       // [1]
    }
    set(value) {
      println("set($value)")
      field = value      // [2]
    }
}

fun main(args: Array<String>) {
  val d = Default()
  d.i = 2
  println(d.i)
}
/* Output:
set(2)
get() called
2
*/
