// Lambdas/Mapping.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf('a', 'b', 'c', 'd')
  val result =
    list.map({ "[${it.toUpperCase()}]" })
  result eq listOf("[A]","[B]","[C]","[D]")
}
