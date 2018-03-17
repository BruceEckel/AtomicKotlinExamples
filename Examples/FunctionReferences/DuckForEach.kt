// FunctionReferences/DuckForEach.kt
import atomictest.eq

fun main(args: Array<String>) {
  var s = ""
  "Duck".forEach { s += "[$it]" }
  s eq "[D][u][c][k]"
}
