// composition/House4.kt
package composition4

interface Building
interface Food
interface Utensil
interface Store<T>
interface Cook<T>
interface Clean<T>
interface Kitchen : Store<Food>, Cook<Food>, Clean<Utensil>
  // Oops. Can't do this:
  // , Store<Utensil>, Clean<Food>

interface House : Building {
  val kitchens: List<Kitchen>
}
