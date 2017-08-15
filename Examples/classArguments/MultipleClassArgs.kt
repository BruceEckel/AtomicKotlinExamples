// classArguments/MultipleClassArgs.kt
import atomicTest.eq

class Sum(val a1: Int, val a2: Int, val a3: Int) {
  fun result(): Int = a1 + a2 + a3
}

fun main(args: Array<String>) {
  Sum(13, 27, 44).result() eq 84
}
