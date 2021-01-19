// Composition/House1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package composition1

interface Building
interface Kitchen

interface House: Building {
  val kitchen: Kitchen
}
