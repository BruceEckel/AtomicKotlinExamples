// SafeCallsAndElvis/DereferenceNull.kt

fun main() {
  val s: String? = null
  // Won't compile:
  // s.length        // [1]
}
