// Interoperability/HiddenArrayList.kt
package interop
import atomictest.eq

fun main() {
  val list = mutableListOf(1, 2, 3)
  list.javaClass.name eq
    "java.util.ArrayList"
}
