// Generics/Holder.kt
package generics
import atomictest.eq

data class Automobile(val brand: String)

class Holder(private val a: Automobile) {
  fun get() = a
}

fun main(arg: Array<String>) {
  Holder(Automobile("Peugot")).get() eq
    "Automobile(brand=Peugot)"
}
