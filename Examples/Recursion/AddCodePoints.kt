// Recursion/AddCodePoints.kt
import atomictest.*

fun cpAdd(s: String): Int {
  if(s.length == 0)
    return 0
  val cp = s.codePointAt(0)
  trace("${s[0]}: $cp")
  return cp + cpAdd(s.substring(1))
}

fun main(args: Array<String>) {
  cpAdd("Kotlin") eq 625
  trace eq """
K: 75
o: 111
t: 116
l: 108
i: 105
n: 110
"""
}
