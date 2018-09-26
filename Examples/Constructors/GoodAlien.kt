// Constructors/GoodAlien.kt

class GoodAlien(val name: String) {
  override fun toString(): String {
    return "GoodAlien('$name')"
  }
}

fun main() {
  val birdPerson = GoodAlien("Birdperson")
  println(birdPerson)
}
/* Output:
GoodAlien('Birdperson')
*/
