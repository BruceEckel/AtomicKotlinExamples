// SafeCallsAndElvis/ElvisCall.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package elvisoperator
import atomictest.eq

fun checkLength(s: String?, expected: Int) {
  val length1 =
    if (s != null) s.length else 0  // [1]
  val length2 = s?.length ?: 0      // [2]
  length1 eq expected
  length2 eq expected
}

fun main() {
  checkLength("abc", 3)
  checkLength(null, 0)
}
