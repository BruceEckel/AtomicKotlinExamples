// Exceptions/IntroducingNull.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  "1$".toIntOrNull() eq null
}
