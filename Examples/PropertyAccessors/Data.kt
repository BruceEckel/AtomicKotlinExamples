// PropertyAccessors/Data.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package propertyaccessors
import atomictest.eq

class Data(var i: Int)

fun main() {
  val data = Data(10)
  data.i eq 10 // Read the 'i' property
  data.i = 20  // Write to the 'i' property
}
