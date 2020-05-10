// Interoperability/JavaList.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3)
  (list is java.util.List<*>) eq true
}
