// OperatorOverloading/Backticks.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.

fun `A long name with spaces`() = Unit

fun `*how* is this working?`() = Unit

fun `'when' is a keyword`() = Unit

// fun `Illegal characters :<>`() = Unit

fun main() {
  `A long name with spaces`()
  `*how* is this working?`()
  `'when' is a keyword`()
}
