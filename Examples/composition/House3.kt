// composition/House3.kt
package composition3

interface Building
interface Kitchen

interface House : Building {
  val kitchens: List<Kitchen>
}
