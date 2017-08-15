// safeCallsAndElvisOperator/ElvisOperator.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s1: String? = "abc"
  val length1 = if (s1 != null) s1.length else 0
  val length2 = s1?.length ?: 0
  length1 eq 3
  length2 eq 3

  val s2: String? = null
  val length3 = if (s2 != null) s2.length else 0
  val length4 = s2?.length ?: 0
  length3 eq 0
  length4 eq 0
}
