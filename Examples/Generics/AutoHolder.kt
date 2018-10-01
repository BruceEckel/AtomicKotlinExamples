// Generics/AutoHolder.kt
package generics
import atomictest.eq

data class Auto(val name: String = "Car")

class AutoHolder(val a: Auto)

fun main() {
  val ah = AutoHolder(Auto())
  val x: Auto = ah.a
  x eq "Auto(name=Car)"
}
