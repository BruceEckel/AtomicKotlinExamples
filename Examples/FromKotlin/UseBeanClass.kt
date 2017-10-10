// FromKotlin/UseBeanClass.kt
import atomictest.eq
import FromKotlin.BeanClass

fun main(args: Array<String>) {
  val bean = BeanClass()
  bean.size eq 100
  bean.description eq "Bean"
  bean.size = 10
  bean.size eq 10
  bean.description = "Smaller"
  bean.description eq "Smaller"
}
