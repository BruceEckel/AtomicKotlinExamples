// FunctionReferences/MapUnpacking.kt
import atomictest.eq

fun main(args: Array<String>) {
  var s = ""
  val m = mapOf("a" to 1, "b" to 2, "c" to 3)
  m.forEach { k, v -> s += "$k$v " }
  s eq "a1 b2 c3 "
}
