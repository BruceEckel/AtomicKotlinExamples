// Enumerations/EnumImport.kt
import atomictest.eq
import enumerations.Level.*    // [1]

fun main(args: Array<String>) {
  Overflow.toString() eq "Overflow"
  High.toString() eq "High"
}
