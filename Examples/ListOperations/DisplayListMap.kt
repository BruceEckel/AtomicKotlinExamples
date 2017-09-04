// ListOperations/DisplayListMap.kt
import atomictest.eq

fun main(args: Array<String>) {
  (1..4).map {
    "[$it]"
  }.reduce {
    str, s -> str + s
  } eq "[1][2][3][4]"
}
