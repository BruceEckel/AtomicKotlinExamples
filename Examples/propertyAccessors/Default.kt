// propertyAccessors/Default.kt
import atomicTest.eq

class Default {
  var trace = ""
  var property: Int = 0
    get() {              // [1]
      trace += "get() called"
      return field
    }
    set(value) {         // [2]
      trace += "set($value) "
      field = value
    }
}

fun main(args: Array<String>) {
  val d = Default()
  d.property = 2         // [3]
  d.property eq 2        // [4]
  d.trace eq "set(2) get() called"
}
