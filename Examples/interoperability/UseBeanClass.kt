// interoperability/UseBeanClass.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import interoperability.Chameleon
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
