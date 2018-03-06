// ImportanceOfLambdas/Closures.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 5, 7, 10)

  var sum = 0
  val divider = 5

  list.filter { it % divider == 0 }
    .forEach { sum += it }
  sum eq 15
}
