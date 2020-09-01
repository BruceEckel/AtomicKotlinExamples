// PropertyAccessors/LogChanges.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package propertyaccessors
import atomictest.eq

class LogChanges {
  var n: Int = 0
    set(value) {
      println("$field becomes $value")
      field = value
    }
}

fun main() {
  val lc = LogChanges()
  lc.n eq 0
  lc.n = 2
  lc.n eq 2
}
/* Output:
0
0 becomes 2
2
*/
