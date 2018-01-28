// Properties/Cup.kt

class Cup {
  var percentFull = 0
}

fun main(args: Array<String>) {
  val c1 = Cup()
  c1.percentFull = 50
  val c2 = Cup()
  c2.percentFull = 100

  println(c1.percentFull)
  println(c2.percentFull)
}
/* Output:
50
100
*/
