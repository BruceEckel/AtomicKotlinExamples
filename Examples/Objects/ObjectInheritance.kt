// Objects/ObjectInheritance.kt
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

fun main(args: Array<String>) {
  Paint("Green").apply() eq
    "Applying Green"
  Acrylic.apply() eq
    "Acrylic, Applying Blue"
  Prepare.prepare() eq "Scrape"
}
