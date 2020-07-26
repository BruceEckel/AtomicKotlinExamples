// CreatingGenerics/ReificationB.kt
package creatinggenerics

// Won't compile because of erasure:
// fun <T> b() = a(T::class.java)
