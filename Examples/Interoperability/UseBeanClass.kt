// Interoperability/UseBeanClass.kt
package interop
import Interoperability.Chameleon
import atomictest.eq

fun main() {
  val chameleon = Chameleon()
  chameleon.size = 1
  chameleon.size eq 1
  chameleon.color = "green"
  chameleon.color eq "green"
  chameleon.color = "turquoise"
  chameleon.color eq "turquoise"
}
