// CreatingGenerics/ReificationD.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

inline fun <reified T> d() = a(T::class.java)

val kd = d<K>()
