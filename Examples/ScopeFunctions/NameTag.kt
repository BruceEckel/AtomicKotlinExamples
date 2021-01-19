// ScopeFunctions/NameTag.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions
import atomictest.trace

val functions = listOf(
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.let { trace("$it in let") }
  },
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.run { trace("$this in run") }
  },
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.apply { trace("$this in apply") }
  },
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.also { trace("$it in also") }
  },
)

fun main() {
  functions.forEach { it(null) }
  functions.forEach { it("  ") }
  functions.forEach { it("Yumyulack") }
  trace eq """
    Yumyulack in let
    Yumyulack in run
    Yumyulack in apply
    Yumyulack in also
  """
}
