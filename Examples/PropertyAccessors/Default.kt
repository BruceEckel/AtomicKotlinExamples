// PropertyAccessors/Default.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertyaccessors
import atomictest.*

class Default {
  var i: Int = 0
    get() {
      trace("get()")
      return field         // [1]
    }
    set(value) {
      trace("set($value)")
      field = value        // [2]
    }
}

fun main() {
  val d = Default()
  d.i = 2
  trace(d.i)
  trace eq """
    set(2)
    get()
    2
  """
}
