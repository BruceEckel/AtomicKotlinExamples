// CreatingGenerics/CheckType.kt
package creatinggenerics
import atomictest.eq

inline fun <reified T> check(t: Any) = t is T

fun main() {
  check<String>("1") eq true
  check<Int>("1") eq false
}
