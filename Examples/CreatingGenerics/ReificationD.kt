// CreatingGenerics/ReificationD.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

inline fun <reified T: Any> d() = a(T::class)

val kd = d<K>()
