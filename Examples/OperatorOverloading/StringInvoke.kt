// OperatorOverloading/StringInvoke.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

operator fun String.invoke(
  f: (s: String) -> String
) = f(this)

fun main() {
  "mumbling" { it.toUpperCase() } eq
    "MUMBLING"
}
