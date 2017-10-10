// FromKotlin/DisplayList.kt
package FromKotlin

import java.util.*

fun List<*>.display() {
  println("[")
  for(e in this)
    println("  $e")
  println("]")
}

fun main(args: Array<String>) {
  val list = Arrays.asList("AA", "BB", "CC")
  list.display()
}
