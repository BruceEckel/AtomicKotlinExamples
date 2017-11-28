// FromKotlin/UseBeanClass.kt
import atomictest.eq
import FromKotlin.Chameleon

fun main(args: Array<String>) {
  val chameleon = Chameleon()
  chameleon.size = 1
  chameleon.size eq 1
  chameleon.color = "green"
  chameleon.color eq "green"
  chameleon.color = "turquoise"
  chameleon.color eq "turquoise"
}
