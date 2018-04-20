// Lambdas/ListIndicesMap.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf('a', 'b', 'c')
  list.indices.map { "[$it: ?]"
  } eq listOf("[0: ?]", "[1: ?]", "[2: ?]")
}
