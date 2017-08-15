// safeCallsAndElvisOperator/DereferenceNull.kt
fun main(args: Array<String>) {
  val s: String? = null
  // Doesn't compile:
  // s.length
}
