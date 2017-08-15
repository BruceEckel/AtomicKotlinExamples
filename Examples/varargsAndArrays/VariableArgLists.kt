// varargsAndArrays/VariableArgLists.kt
fun foo(s: String, d: Double, vararg ints: Int) {}

fun main(args: Array<String>) {
  foo("abc", 1.0, 1, 2, 3, 4)
}
