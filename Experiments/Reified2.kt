fun type(c: Any) = c::class.qualifiedName

fun main(s: Array<String>) {
  println(type(""))
}
