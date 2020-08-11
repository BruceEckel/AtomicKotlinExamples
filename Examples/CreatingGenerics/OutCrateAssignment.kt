// CreatingGenerics/OutCrateAssignment.kt
package creatinggenerics

val ocg: OutCrate<Grape> = OutCrate(Grape())
val ocb: OutCrate<Beverage> = ocg
val occ: OutCrate<Can> = ocg

fun getting() {
  val grape: Grape = ocg.get()
  val beverage: Beverage = ocb.get()
  val can: Can = occ.get()
}
