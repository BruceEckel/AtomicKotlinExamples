// Constructors/Scientist.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.

class Scientist(val name: String) {
  override fun toString() =
    "Scientist('$name')"
}

fun main() {
  val zeep = Scientist("Zeep Xanflorp")
  println(zeep)
}
/* Output:
Scientist('Zeep Xanflorp')
*/
