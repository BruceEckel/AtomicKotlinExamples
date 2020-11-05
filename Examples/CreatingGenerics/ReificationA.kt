// CreatingGenerics/ReificationA.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import kotlin.reflect.KClass

fun <T: Any> a(kClass: KClass<T>) {
//   Uses KClass<T>
}
