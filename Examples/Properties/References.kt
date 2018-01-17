// Properties/References.kt

class Kitchen {
  var table: String = "Round table"
}

fun main(args: Array<String>) {
  val kitchen1 = Kitchen()
  val kitchen2 = kitchen1
  println("kitchen1: ${kitchen2.table}")
  println("kitchen2: ${kitchen2.table}")
  kitchen1.table = "Square table"
  println("kitchen1: ${kitchen2.table}")
  println("kitchen2: ${kitchen2.table}")
}
/* Output:
kitchen1: Round table
kitchen2: Round table
kitchen1: Square table
kitchen2: Square table
*/
