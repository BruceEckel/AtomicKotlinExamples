// Summary2/PropertyReadWrite.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package summary2
import atomictest.eq

class Holder(var i: Int)

fun main() {
  val holder = Holder(10)
  holder.i eq 10 // Read the 'i' property
  holder.i = 20  // Write to the 'i' property
}
