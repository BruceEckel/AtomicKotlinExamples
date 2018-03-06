// Lambdas/FirstExample.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3, 4)
  val result =
    list.map({ n: Int -> "[$n]" })
  result eq listOf("[1]","[2]","[3]","[4]")
}
