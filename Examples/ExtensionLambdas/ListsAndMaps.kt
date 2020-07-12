// ExtensionLambdas/ListsAndMaps.kt
@file:OptIn(ExperimentalStdlibApi::class)
package extensionlambdas
import atomictest.eq

val characters: List<String> = buildList {
  add("Chars:")                       // [1]
  ('a'..'d').forEach { add("$it") }
}

val chars: Map<Char, Int> = buildMap {
  for (ch in ('A'..'F').withIndex())
    put(ch.value, ch.index)
}

fun main() {
  characters eq "[Chars:, a, b, c, d]"
  chars eq "{A=0, B=1, C=2, D=3, E=4, F=5}"
}
