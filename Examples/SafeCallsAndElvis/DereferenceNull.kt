// SafeCallsAndElvis/DereferenceNull.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val s: String? = null
  // Doesn't compile:
  // s.length        // [1]
}
