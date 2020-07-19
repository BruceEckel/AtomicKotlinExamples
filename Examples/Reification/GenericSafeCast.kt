// Reification/GenericSafeCast.kt
package reification
import kotlin.reflect.KClass
import atomictest.eq

inline infix fun <reified T: Any> Any?.to(
  klass: KClass<T>
): T? = if (klass.isInstance(this)) this as T
  else null

inline fun <reified T: Any, R> Any?.to(
  klass: KClass<T>, convert: T.() -> R?
): R? = if (klass.isInstance(this))
    convert(this as T)
  else null

fun main() {
  "foo" to String::class eq "foo"
  "foo".to(String::class) { "bar" } eq "bar"
}
