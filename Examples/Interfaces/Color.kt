// Interfaces/Color.kt
package propertiesininterfaces

interface Color {
  val symbol: Char
}

class Red : Color {
  override val symbol get() = 'R'
}

class Green : Color {
  override val symbol get() = 'G'
}

class Blue : Color {
  override val symbol get() = 'B'
}
