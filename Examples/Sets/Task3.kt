// Sets/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package setsExercise3
import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

private fun countPercent(productsCart: Set<String>, groceryCart: Set<String>) =
  100.0 * (productsCart intersect groceryCart).size / groceryCart.size

fun percentMeat(groceryCart: Set<String>): Double =
  countPercent(meats, groceryCart)

fun percentFruit(groceryCart: Set<String>): Double =
  countPercent(fruits, groceryCart)

fun percentVeggies(groceryCart: Set<String>): Double =
  countPercent(vegetables, groceryCart)

fun percentOther(groceryCart: Set<String>): Double =
  100.0 * (groceryCart - meats - fruits - vegetables).size / groceryCart.size

fun main() {
  val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

  percentMeat(groceryCart) eq 10.0
  percentFruit(groceryCart) eq 20.0
  percentVeggies(groceryCart) eq 50.0
  percentOther(groceryCart) eq 20.0
}
