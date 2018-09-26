// SafeCallsAndElvis/ElvisOperator.kt
import atomictest.eq

fun main() {
  val s1: String? = "abc"
  (s1 ?: "---") eq "abc"

  val s2: String? = null
  (s2 ?: "---") eq "---"
}
