// Constructors/MultipleArgs.kt

class AlienSpecies(
  val name: String,
  val eyes: Int,
  val hands: Int,
  val legs: Int
) {
  fun represent() =
    "$name with $eyes eyes, " +
    "$hands hands and $legs legs"
}

fun main(args: Array<String>) {
  val shim =
    AlienSpecies("Shimshamian", 3, 2, 2)
  val grung =
    AlienSpecies("Grunglokian", 2, 4, 2)
  println(shim.represent())
  println(grung.represent())
}
/* Output:
Shimshamian with 3 eyes, 2 hands and 2 legs
Grunglokian with 2 eyes, 4 hands and 2 legs
*/
