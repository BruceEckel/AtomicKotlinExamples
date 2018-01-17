// Maps/GetValue.kt
import atomictest.*

fun main(args: Array<String>) {
  val map = mapOf('a' to "attempt")
  map['b'] eq null
  capture {
    map.getValue('b')
  } eq "NoSuchElementException: " +
          "Key b is missing in the map."
}
