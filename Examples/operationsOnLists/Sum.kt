// operationsOnLists/Sum.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val l = listOf(1, 10, 100, 1000)
  var sum = 0
  l.forEach { x -> sum += x }
  sum eq 1111
}
