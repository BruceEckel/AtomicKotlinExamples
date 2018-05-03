// Summary2/PropertyReadWrite.kt
package summary2
import atomictest.eq

class Data(var i: Int)

fun main(args: Array<String>) {
  val data = Data(10)
  data.i eq 10 // Read the 'i' property
  data.i = 20  // Write to the 'i' property
}
