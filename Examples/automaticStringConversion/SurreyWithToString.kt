// automaticStringConversion/SurreyWithToString.kt
import atomicTest.eq

class Surrey2(val adornment: String) {
  override fun toString() =
      "Surrey, the $adornment"
}

fun main(args: Array<String>) {
  val fancy2 = Surrey2("fringe on top")
  fancy2 eq "Surrey, the fringe on top"
}
