// safeCalls/DereferenceNull.kt

fun main(args: Array<String>) {
  val s: String? = null
  // Won't compile:
  // s.length
}
