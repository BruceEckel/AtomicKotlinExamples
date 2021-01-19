// OperatorOverloading/EqualsForNullable.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

fun equalsWithIf(a: E?, b: E?) =
  if (a === null)
    b === null
  else
    a == b

fun equalsWithElvis(a: E?, b: E?) =
  a?.equals(b) ?: (b === null)

fun main() {
  val x: E? = null
  val y = E(0)
  val z: E? = null
  (x == y) eq false
  (x == z) eq true
  equalsWithIf(x, y) eq false
  equalsWithIf(x, z) eq true
  equalsWithElvis(x, y) eq false
  equalsWithElvis(x, z) eq true
}
