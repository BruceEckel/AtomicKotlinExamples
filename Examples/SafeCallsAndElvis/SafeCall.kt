// SafeCallsAndElvis/SafeCall.kt
package safecalls
import atomictest.eq

fun checkLength(s: String?, expected: Int?) {
  val length1 =
    if (s != null) s.length else null   // [1]
  val length2 = s?.length               // [2]
  length1 eq expected
  length2 eq expected
}

fun main(args: Array<String>) {
  checkLength("abc", 3)
  checkLength(null, null)
}
