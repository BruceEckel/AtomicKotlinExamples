// DesigningWithInheritance/Beverages.kt
import atomictest.eq

interface Beverage

class Coffee : Beverage {
  var description = "coffee"

  fun addMilk() {
    description += " with milk"
  }

  fun addSugar() {
    description += " with sugar"
  }

  override fun toString() = description
}

class Wine : Beverage {
  override fun toString() = "wine"
}

interface Meal {
  val beverage: Beverage
}

class Lunch : Meal {
  override val beverage = Coffee()   // [1]

  init {
    beverage.addMilk()               // [2]
    beverage.addSugar()
  }
}

class Dinner : Meal {
  override val beverage = Wine()     // [3]
}

fun main() {
  val lunch = Lunch()
  lunch.beverage eq
    "coffee with milk with sugar"

  val dinner = Dinner()
  dinner.beverage eq "wine"

  val meal: Meal = lunch             // [4]
  // Doesn't compile:
  // meal.beverage.addSugar()        // [5]
}
