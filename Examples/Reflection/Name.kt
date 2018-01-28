// Reflection/Name.kt
package reflection

fun className(a: Any): String =
  a::class.simpleName ?: ""
