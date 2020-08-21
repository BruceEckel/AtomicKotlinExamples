// CreatingGenerics/InCrateAssignment.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

val icc: InCrate<Can> = InCrate(Can())
val icb: InCrate<Beverage> = icc
val icg: InCrate<Grape> = icc
val ich: InCrate<Cherry> = icc

fun main() {
  icc.put(Can())
  icc.put(Beverage())
  icc.put(Grape())
  icc.put(Cherry())

  icb.put(Beverage())
  icb.put(Grape())
  icb.put(Cherry())

  icg.put(Grape())
  ich.put(Cherry())
}
