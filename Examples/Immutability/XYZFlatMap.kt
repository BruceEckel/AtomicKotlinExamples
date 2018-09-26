// Immutability/XYZFlatMap.kt
package xyzflatmap

enum class XYZ { x, y, z }

fun main() {
  val flat = XYZ.values().flatMap { a ->
    XYZ.values().map {
      b -> a to b
    }
  }
  flat.forEach { println(it) }
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
