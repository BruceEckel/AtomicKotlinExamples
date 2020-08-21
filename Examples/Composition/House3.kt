// Composition/House3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package composition3

interface Building
interface Kitchen

interface House: Building {
  val kitchens: List<Kitchen>
}
