// FromKotlin/DisplayList.kt
package FromKotlin
import java.util.*
import atomictest.*

fun List<*>.display() {
  trace("[")
  for(e in this)
    trace("  $e")
  trace("]")
}

fun main(args: Array<String>) {
  val list = Arrays.asList("AA", "BB", "CC")
  list.display()
  trace eq """
[
  AA
  BB
  CC
]
"""
}
