// MoreGenerics/GenericSafeCast.kt
package moregenerics
import kotlin.reflect.KClass

inline infix fun <reified T: Any> Any?.to(
  klass: KClass<T>
): T? =
  if (klass.isInstance(this)) this as T
  else null

inline fun <reified T: Any, R> Any?.to(
  klass: KClass<T>,
  convert: T.() -> R? // = { it } ???
): R? =
  if (klass.isInstance(this)) {
    convert(this as T)
  } else {
    null
  }

fun main() {
  val x: String? = "foo" to String::class
}
