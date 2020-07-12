// MoreGenerics/GenericReturnType.kt
package moregenerics
import atomictest.*

inline fun <reified T> f(i: Int): T =
  when (T::class) {
    Int::class -> i as T
    Double::class -> i.toDouble() as T
    else -> i.toString() as T
  }

fun main() {
  val i: Int = f(12)
  val ii = f<Int>(12)
  val d: Double = f(42)
  val s: String = f(67)
  // The check happens at runtime:
  capture {
    val ff: Float = f(0)
  }.startsWith("ClassCastException: class" +
    " java.lang.String cannot be cast" +
    " to class java.lang.Float") eq true
  capture {
    val b: Boolean = f(0)
  }.startsWith("ClassCastException: class" +
    " java.lang.String cannot be cast" +
    " to class java.lang.Boolean") eq true
}
