// Summary2/GetterAndSetter.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package summary2

class GetterAndSetter {
  var i: Int = 0
    get() {
      println("get()")
      return field
    }
    set(value) {
      println("set($value)")
      field = value
    }
}

fun main() {
  val gs = GetterAndSetter()
  gs.i = 2
  println(gs.i)
}
/* Output:
set(2)
get()
2
*/
