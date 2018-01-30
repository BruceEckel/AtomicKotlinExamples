// CollectionsAndJava/HiddenArrayList.kt
import atomictest.eq

fun main(args: Array<String>) {
  val list = mutableListOf(1, 2, 3)
  list.javaClass.name eq
    "java.util.ArrayList"
}
