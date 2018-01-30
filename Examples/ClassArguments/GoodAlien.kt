// ClassArguments/GoodAlien.kt

class GoodAlien(val name: String) {
  override fun toString(): String {
    return "GoodAlien('$name')"
  }
}

fun main(args: Array<String>) {
  val birdPerson = GoodAlien("Birdperson")
  println(birdPerson)
}
/* Output:
GoodAlien('Birdperson')
*/
