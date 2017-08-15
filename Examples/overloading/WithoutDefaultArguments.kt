// overloading/WithoutDefaultArguments.kt
fun f(n: Int): Int = n + 373
fun f(): Int = f(0)

fun main(args: Array<String>) {
  println(f())
}
