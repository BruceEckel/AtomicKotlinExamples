// Lists/ArrayListOf.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = arrayListOf<String>()
  list.add("Hello")
  list.add("World!")
  list eq "[Hello, World!]"
  val list2 = arrayListOf("Goodbye")
  list2.add("World!")
  list2 eq "[Goodbye, World!]"
}
