// StringConversion/BetterSurrey.kt
import atomictest.eq

class Surrey2(val adornment: String) {
  override fun toString() =
      "Surrey with the $adornment"
}

fun main(args: Array<String>) {
  val fancy2 = Surrey2("fringe on top")
  fancy2 eq "Surrey with the fringe on top"
}
