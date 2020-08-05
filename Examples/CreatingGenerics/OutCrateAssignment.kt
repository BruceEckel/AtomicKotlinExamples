// CreatingGenerics/OutCrateAssignment.kt
package creatinggenerics

val ocg = OutCrate(Grape())
val ocb: OutCrate<Beverage> = ocg
val occ: OutCrate<Can> = ocg
