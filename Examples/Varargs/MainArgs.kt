// Varargs/MainArgs.kt

fun main(args: Array<String>) {
  for(a in args)
    println("$a is String: ${a is String}")
}
