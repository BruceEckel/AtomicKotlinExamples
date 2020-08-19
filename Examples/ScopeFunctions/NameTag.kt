// ScopeFunctions/NameTag.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions
import atomictest.trace

val functions = listOf(
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.let { trace("Hi! I am $it") }
  },
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.run { trace("Hi! I am $this") }
  },
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.apply { trace("Hi! I am $this") }
  },
  fun(name: String?) {
    name
      ?.takeUnless { it.isBlank() }
      ?.also { trace("Hi! I am $it") }
  }
)

fun main() {
  functions.forEach { it(null) }
  functions.forEach { it("  ") }
  functions.forEach { it("Yumyulack") }
  trace eq """
    Hi! I am Yumyulack
    Hi! I am Yumyulack
    Hi! I am Yumyulack
    Hi! I am Yumyulack
  """
}
