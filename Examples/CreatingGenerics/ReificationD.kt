// CreatingGenerics/ReificationD.kt
package creatinggenerics

inline fun <reified T> d() = a(T::class.java)

val kd = d<K>()
