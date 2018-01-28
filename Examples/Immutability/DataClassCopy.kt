// Immutability/DataClassCopy.kt
import atomictest.eq

data class DC(
  val a: String,
  val b: String,
  val c: String,
  val d: String
)

fun main(args: Array<String>) {
  val dc = DC("one", "two", "three", "four")
  val dc2 = dc.copy(b = "bouncy", d = "red")
  dc eq "DC(a=one, b=two, c=three, d=four)"
  dc2 eq "DC(a=one, b=bouncy, c=three, d=red)"
}
