// CreatingGenerics/ReificationC.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

fun <T> c(class_: Class<T>) = a(class_)

class K

val kc = c(K::class.java)
