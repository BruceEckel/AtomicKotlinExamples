// ScopeFunctions/NullGnome.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions
import atomictest.*

fun whichGnome(gnome: Gnome?) {
  trace(gnome?.name)
  gnome?.let { trace(it.who()) }
  gnome?.run { trace(who()) }
  gnome?.apply { trace(who()) }
  gnome?.also { trace(it.who()) }
}

fun main() {
  whichGnome(Gnome("Bob"))
  whichGnome(null)
  trace eq """
    Bob
    Gnome: Bob
    Gnome: Bob
    Gnome: Bob
    Gnome: Bob
    null
  """
}
