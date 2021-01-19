// ExtensionLambdas/Vanbo.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionlambdas
import atomictest.eq

val va: (String, Int) -> String = { str, n ->
  str.repeat(n) + str.repeat(n)
}

val vb: String.(Int) -> String = {
  this.repeat(it) + repeat(it)
}

fun main() {
  va("Vanbo", 2) eq "VanboVanboVanboVanbo"
  "Vanbo".vb(2) eq "VanboVanboVanboVanbo"
  vb("Vanbo", 2) eq "VanboVanboVanboVanbo"
  // "Vanbo".va(2) // Doesn't compile
}
