// ScopeFunctions/NullGnome.kt
package scopefunctions
import atomictest.*

fun whichGnome(gnome: Gnome?) {
  gnome?.let { trace(it.who()) }
  gnome?.run { trace(who()) }
  gnome?.apply { trace(who()) }
  gnome?.also { trace(it.who()) }
}

fun main() {
  trace("null:")
  whichGnome(null)
  trace("Bob:")
  whichGnome(Gnome("Bob"))
  trace eq """
    null:
    Bob:
    Gnome: Bob
    Gnome: Bob
    Gnome: Bob
    Gnome: Bob
  """
}