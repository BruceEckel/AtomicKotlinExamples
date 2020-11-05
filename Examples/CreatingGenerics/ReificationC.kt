// CreatingGenerics/ReificationC.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import kotlin.reflect.KClass

fun <T: Any> c(kClass: KClass<T>) = a(kClass)

class K

val kc = c(K::class)
