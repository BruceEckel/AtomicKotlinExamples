// Varargs/VarargListMap.kt
import atomictest.eq

fun display(vararg nums: Int) =
  nums.map {
    "[$it]"
  }.reduce {
    str, s -> str + s
  }

fun main(args: Array<String>) {
  display(1, 2, 3, 4) eq "[1][2][3][4]"
}
