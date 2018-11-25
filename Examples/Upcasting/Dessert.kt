// Upcasting/Dessert.kt
package upcasting
import atomictest.eq

open class Dessert(val calories: Int) {
  protected var additionalCalories = 0
  open fun serve() = "serve Dessert"
  fun total() = calories + additionalCalories
}

class Candy(calories: Int) :
  Dessert(calories) {
  override fun serve() = "unwrapping Candy"
}

class Pie(calories: Int) :
  Dessert(calories) {
  override fun serve() = "cutting Pie"
  fun addWhippedCream(): String {
    additionalCalories += 50
    return "Adding Whipped Cream"
  }
}

class IceCream(calories: Int) :
  Dessert(calories) {
  override fun serve() = "scooping IceCream"
  fun addSyrup(): String {
    additionalCalories += 100
    return "Adding Syrup"
  }
}

class Eater {
  var calories = 0
    private set        // [1]
  fun eatDessert(dessert: Dessert): String {
    calories += dessert.total()
    return "${dessert.serve()}: " +
      "$calories calories"
  }
}

fun main() {
  val eater = Eater()
  eater.eatDessert(IceCream(300)) eq
    "scooping IceCream: 300 calories"
  eater.eatDessert(Pie(250)) eq
    "cutting Pie: 550 calories"
  eater.eatDessert(Candy(200)) eq
    "unwrapping Candy: 750 calories"
  eater.calories eq 750
}
