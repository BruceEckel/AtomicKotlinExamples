// ErrorReporting/STUB.kt
import atomictest.*

fun STUB(vararg desc: String): Nothing {
  println("== ${desc[0]} ==")
  for(n in 1..(desc.size - 1))
    println("  ${desc[n]}")
  throw NotImplementedError("STUB")
}

fun incomplete(): Int = STUB(
  "Descriptive Title",
  "1. First item",
  "2. Second item",
  "3. Third item")

fun main(args: Array<String>) {
  capture {
    incomplete()
  } eq "NotImplementedError: STUB"
}
