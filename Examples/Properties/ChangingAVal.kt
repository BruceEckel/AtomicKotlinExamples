// Properties/ChangingAVal.kt

class House {
  var sofa: String = ""
}

fun main(args: Array<String>) {
  val house = House()
  house.sofa = "Simple sleeper sofa: $89.00"
  println(house.sofa)
  house.sofa = "New leather sofa: $3,099.00"
  println(house.sofa)
  // Not allowed:
  // house = House("Loveseat")
}
/* Output:
Simple sleeper sofa: $89.00
New leather sofa: $3,099.00
*/
