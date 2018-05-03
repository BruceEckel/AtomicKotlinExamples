// Summary2/GettersAndSetter.kt
package summary2

class GettersAndSetter {
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

fun main(args: Array<String>) {
  val gs = GettersAndSetter()
  gs.i = 2
  println(gs.i)
}
/* Output:
set(2)
get()
2
*/
