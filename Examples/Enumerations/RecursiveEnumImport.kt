// Enumerations/RecursiveEnumImport.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package enumerations
import atomictest.eq
import enumerations.Size.*            // [1]

enum class Size {
  Tiny, Small, Medium, Large, Huge, Gigantic
}

fun main() {
  Gigantic eq "Gigantic"               // [2]
  Size.values().toList() eq            // [3]
    listOf(Tiny, Small, Medium,
      Large, Huge, Gigantic)
  Tiny.ordinal eq 0                    // [4]
  Huge.ordinal eq 4
}
