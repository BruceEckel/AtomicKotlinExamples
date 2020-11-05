// CreatingGenerics/CheckType.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import atomictest.eq

inline fun <reified T> check(t: Any) = t is T
// fun <T> check1(t: Any) = t is T      // [1]

fun main() {
  check<String>("1") eq true
  check<Int>("1") eq false
}
