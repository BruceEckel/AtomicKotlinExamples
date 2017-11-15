// Enumerations/RecursiveEnumImport.kt
package enumerations
import atomictest.eq
import enumerations.Size.*            // [1]

enum class Size {
  Tiny, Small, Medium, Large, Huge, Gigantic
}

fun main(args: Array<String>) {
  Gigantic eq "Gigantic"               // [2]
  Size.values().toList() eq            // [3]
  listOf(Tiny, Small, Medium,
    Large, Huge, Gigantic)
}
