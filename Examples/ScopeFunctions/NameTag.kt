// ScopeFunctions/NameTag.kt
package scopefunctions
import atomictest.*

fun letx(name: String?) {
  name
    ?.takeUnless { it.isBlank() }
    ?.let { trace("Hi! My name is: $it") }
}

fun runx(name: String?) {
  name
    ?.takeUnless { it.isBlank() }
    ?.run { trace("Hi! My name is: $this") }
}

fun applyx(name: String?) {
  name
    ?.takeUnless { it.isBlank() }
    ?.apply { trace("Hi! My name is: $this") }
}

fun alsox(name: String?) {
  name
    ?.takeUnless { it.isBlank() }
    ?.also { trace("Hi! My name is: $it") }
}

val funcs =
  listOf(::letx, ::runx, ::applyx, ::alsox)

fun main() {
  funcs.forEach { it(null) }
  funcs.forEach { it("") }
  funcs.forEach { it("Yumyulack") }
  trace eq """
    Hi! My name is: Yumyulack
    Hi! My name is: Yumyulack
    Hi! My name is: Yumyulack
    Hi! My name is: Yumyulack
  """
}
