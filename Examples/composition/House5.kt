// composition/House5.kt
package composition5

interface Building
interface Room
interface Storage
interface Sink
interface Store<T>
interface Cook<T>
interface Clean<T>
interface Food : Store<Food>,
    Clean<Food>, Cook<Food>

interface Utensil : Store<Utensil>,
    Clean<Utensil>, Cook<Utensil>

interface Kitchen : Room {
  val storage: Storage
  val sinks: List<Sink>
  val food: Food
  val utensils: List<Utensil>
}

interface House : Building {
  val kitchens: List<Kitchen>
}
