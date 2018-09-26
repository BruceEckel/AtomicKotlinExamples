// Constructors/MultipleArgs.kt

class AlienSpecies(
  val name: String,
  val eyes: Int,
  val hands: Int,
  val legs: Int
) {
  fun describe() =
    "$name with $eyes eyes, " +
    "$hands hands and $legs legs"
}

fun main() {
  val shim =
    AlienSpecies("Shimshamian", 3, 2, 2)
  val grung =
    AlienSpecies("Grunglokian", 2, 4, 2)
  println(shim.describe())
  println(grung.describe())
}
/* Output:
Shimshamian with 3 eyes, 2 hands and 2 legs
Grunglokian with 2 eyes, 4 hands and 2 legs
*/
