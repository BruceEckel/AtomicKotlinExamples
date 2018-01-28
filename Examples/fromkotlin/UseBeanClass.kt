// fromkotlin/UseBeanClass.kt
import fromkotlin.Chameleon
import atomictest.eq

fun main(args: Array<String>) {
  val chameleon = Chameleon()
  chameleon.size = 1
  chameleon.size eq 1
  chameleon.color = "green"
  chameleon.color eq "green"
  chameleon.color = "turquoise"
  chameleon.color eq "turquoise"
}
