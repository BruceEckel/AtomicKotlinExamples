// safeCallsAndElvisOperator/SafeCall.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s1: String? = "abc"
  val length1 = if (s1 != null) s1.length else null
  val length2 = s1?.length
  length1 eq 3
  length2 eq 3

  val s2: String? = null
  val length3 = if (s2 != null) s2.length else null
  val length4 = s2?.length
  length3 eq null
  length4 eq null
}
