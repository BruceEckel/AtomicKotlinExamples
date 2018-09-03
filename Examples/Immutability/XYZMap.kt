// Immutability/XYZMap.kt
package xyzmap

enum class XYZ { x, y, z }

fun main(args: Array<String>) {
  val normal = XYZ.values().map { a ->
    println()
    XYZ.values().map {
      b -> print("$a:$b,"); a to b
    }
  }
  println()
  for(f in normal)
    println(f)
}
/* Output:
x:x,x:y,x:z,
y:x,y:y,y:z,
z:x,z:y,z:z,
[(x, x), (x, y), (x, z)]
[(y, x), (y, y), (y, z)]
[(z, x), (z, y), (z, z)]
*/
