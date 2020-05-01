fun <T, U, V> toStr(t: T, u: U, v: V) = "$t$u$v"
fun toStr2(t: Any, u: Any, v: Any) = "$t$u$v"

fun main(args: Array<String>) {
  println(toStr("bob", 37, 1.005))
  println(toStr2("bob", 37, 1.005))
}
