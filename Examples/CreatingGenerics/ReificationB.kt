// CreatingGenerics/ReificationB.kt
package creatinggenerics

// Doesn't compile because of erasure:
// fun <T> b() = a(T::class.java)
