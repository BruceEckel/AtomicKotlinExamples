fun main(args: Array<String>) {
  val s = "Hello"
  println(s::class)
  println(s::class.java)
  val n = null
  val n2 = n
  println(n2!!::class)
}
