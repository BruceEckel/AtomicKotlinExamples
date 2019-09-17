// DesigningWithInheritance/UsingLists.kt
package designingwithinheritance

fun read(list: List<Int>) {
  println(list)
}

fun mutate(mlist: MutableList<Int>) {
  mlist.add(10)
}

fun main() {
  val list = mutableListOf(1, 2, 3)
  read(list)
  mutate(list)
}
