// Objects/ObjectInheritance.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package objects
import atomictest.eq

open class Paint(val color: String) {
  open fun apply() = "Applying $color"
}

object Acrylic: Paint("Blue") {
  override fun apply() =
    "Acrylic, ${super.apply()}"
}

interface PaintPreparation {
  fun prepare(): String
}

object Prepare: PaintPreparation {
  override fun prepare() = "Scrape"
}

fun main() {
  Prepare.prepare() eq "Scrape"
  Paint("Green").apply() eq "Applying Green"
  Acrylic.apply() eq "Acrylic, Applying Blue"
}
