// ScopeFunctions/Gnome.kt
package scopefunctions

class Gnome(val name: String) {
  fun who() = "Gnome: $name"
}

fun whatGnome(gnome: Gnome?) {
  gnome.let { it?.who() }
  gnome?.let { it.who() }
  gnome.run { this?.who() }
  gnome?.run { who() }
  gnome.apply { this?.who() }
  gnome?.apply { who() }
  gnome.also { it?.who() }
  gnome?.also { it.who() }
  // No help for nullability:
  with(gnome) { this?.who() }
}