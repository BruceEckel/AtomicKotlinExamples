// SafeCallsAndElvis/DereferenceNull.kt

fun main() {
  val s: String? = null
  // Doesn't compile:
  // s.length        // [1]
}
