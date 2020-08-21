// CreatingGenerics/ReificationB.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

// Doesn't compile because of erasure:
// fun <T> b() = a(T::class.java)
