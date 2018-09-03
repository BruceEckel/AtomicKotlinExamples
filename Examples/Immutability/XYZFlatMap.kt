// Immutability/XYZFlatMap.kt
package xyzflatmap

enum class XYZ { x, y, z }

fun main(args: Array<String>) {
  val flat = XYZ.values().flatMap { a ->
    XYZ.values().map {
      b -> a to b
    }
  }
  for(s in flat)
    println(s)
}
/* Output:
(x, x)
(x, y)
(x, z)
(y, x)
(y, y)
(y, z)
(z, x)
(z, y)
(z, z)
*/
