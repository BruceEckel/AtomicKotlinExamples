// DesigningWithInheritance/Drinks.kt
import atomictest.eq

interface Drink

class Coffee : Drink {
  var description = "coffee"

  fun addMilk() {
    description += " with milk"
  }

  fun addSugar() {
    description += " with sugar"
  }

  override fun toString() = description
}

class Wine : Drink {
  override fun toString() = "wine"
}

interface Meal {
  val drink: Drink
}

class Lunch : Meal {
  override val drink: Coffee = Coffee() // [1]

  init {
    drink.addMilk()                     // [2]
    drink.addSugar()
  }
}

class Dinner : Meal {
  override val drink: Wine = Wine()     // [3]
}

fun main() {
  val lunch = Lunch()
  lunch.drink eq "coffee with milk with sugar"

  val dinner = Dinner()
  dinner.drink eq "wine"

  val meal: Meal = lunch                // [4]
  // Doesn't compile:
  // meal.drink.addSugar()              // [5]
}
