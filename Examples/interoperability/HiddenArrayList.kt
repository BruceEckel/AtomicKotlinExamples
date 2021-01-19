// interoperability/HiddenArrayList.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val list = mutableListOf(1, 2, 3)
  list.javaClass.name eq
    "java.util.ArrayList"
}
