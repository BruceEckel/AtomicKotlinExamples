// CreatingGenerics/InCrateAssignment.kt
package creatinggenerics

val icc: InCrate<Can> = InCrate(Can())
val icb: InCrate<Beverage> = icc
val icg: InCrate<Grape> = icc
