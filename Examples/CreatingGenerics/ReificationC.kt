// CreatingGenerics/ReificationC.kt
package creatinggenerics

fun <T> c(class_: Class<T>) = a(class_)

class K

val kc = c(K::class.java)
