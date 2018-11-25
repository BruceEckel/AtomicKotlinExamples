// Upcasting/Downcasting.kt
package upcasting
import atomictest.eq

class Eater2 {
  var calories = 0
    private set
  private fun Dessert.add() = when(this) {
    is IceCream -> this.addSyrup()
    is Pie -> this.addWhippedCream()
    is Candy -> ""
    else -> ""
  }
  fun eatDessert(
    dessert: Dessert,
    indulge: Boolean = false
  ): String {
    val a = if(indulge) dessert.add() else ""
    calories += dessert.total()
    return "${dessert.serve()} $a: " +
      "$calories calories"
  }
}

fun main() {
  val eater = Eater2()
  eater.eatDessert(IceCream(300), true) eq
    "scooping IceCream " +
    "Adding Syrup: 400 calories"
  eater.eatDessert(Pie(250), true) eq
    "cutting Pie " +
    "Adding Whipped Cream: 700 calories"
  eater.eatDessert(Candy(200), true) eq
    "unwrapping Candy : 900 calories"
  eater.calories eq 900
}
