// Reflection/Solid.kt
import atomictest.eq
import reflection.className

class Solid {
  override fun toString() = className(this)
}

class Solid2(val size: Int) {
  override fun toString() =
    "${className(this)}($size)"
}

fun main(args: Array<String>) {
  Solid() eq "Solid"
  Solid2(47) eq "Solid2(47)"
}
