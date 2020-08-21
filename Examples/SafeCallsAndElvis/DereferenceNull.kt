// SafeCallsAndElvis/DereferenceNull.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun main() {
  val s: String? = null
  // Doesn't compile:
  // s.length        // [1]
}
