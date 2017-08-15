// lambdas/DisplayList.kt
fun show(n: Int) {
  println("> " + n)
}

fun main(args: Array<String>) {
  val l = listOf(1, 2, 3, 4)
  l.forEach(::show)
}
