// composition/House2.kt
package composition2

interface Building
interface Kitchen
interface House : Building {
  val kitchen1: Kitchen
  val kitchen2: Kitchen
}
