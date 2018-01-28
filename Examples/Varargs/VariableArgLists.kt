// Varargs/VariableArgLists.kt

fun v(s: String, vararg d: Double) {}

fun main(args: Array<String>) {
  v("abc", 1.0, 2.0, 3.0, 4.0)
}
