// Polymorphism/Dessert2.kt
package polymorphism
import atomictest.eq

fun main() {
  val eater = Eater()
  val iceCream = IceCream(300)
  iceCream.addSyrup() eq "Adding Syrup"
  iceCream.total() eq 400
  eater.eatDessert(iceCream) eq
    "scooping IceCream: 400 calories"
  val pie = Pie(250)
  pie.addWhippedCream() eq
    "Adding Whipped Cream"
  pie.total() eq 300
  eater.eatDessert(pie) eq
    "cutting Pie: 700 calories"
  eater.calories eq 700
}
