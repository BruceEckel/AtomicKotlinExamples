// Interfaces/SAM.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interfaces

fun interface ZeroArg {
  fun f(): Int
}

fun interface OneArg {
  fun g(n: Int): Int
}

fun interface TwoArg {
  fun h(i: Int, j: Int): Int
}
