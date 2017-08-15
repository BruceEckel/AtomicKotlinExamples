// lambdas/TwoArgAnonymous.kt
fun main(args: Array<String>) {
  val l = "abc"
  l.forEachIndexed { index, ch -> println("$index: $ch") }
  /* prints:
  0: a
  1: b
  2: c
  */
}
