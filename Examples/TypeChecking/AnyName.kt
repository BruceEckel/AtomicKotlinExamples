// TypeChecking/AnyName.kt
package typechecking

val Any.name
  get() = this::class.simpleName
