// OperationsOnCollections/ListInit.kt
import atomictest.eq

fun main(args: Array<String>) {
  val n1 = List(5, { 10 * (it + 1) })
  n1 eq "[10, 20, 30, 40, 50]"
  val n2 = List(5) { 10 * (it + 1) }
  n2 eq "[10, 20, 30, 40, 50]"
}
