// CreatingGenerics/OutCrateAssignment.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

val ocg: OutCrate<Grape> = OutCrate(Grape())
val ocb: OutCrate<Beverage> = ocg
val occ: OutCrate<Can> = ocg

fun getting() {
  val grape: Grape = ocg.get()
  val beverage: Beverage = ocb.get()
  val can: Can = occ.get()
}
