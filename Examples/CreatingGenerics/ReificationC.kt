// CreatingGenerics/ReificationC.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import kotlin.reflect.KClass

fun <T: Any> c(kClass: KClass<T>) = a(kClass)

class K

val kc = c(K::class)
