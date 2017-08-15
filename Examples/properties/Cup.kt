// properties/Cup.kt
import atomicTest.eq

class Cup {
  var percentFull = 0
}

fun main(args: Array<String>) {
  val c1 = Cup()
  c1.percentFull = 50
  val c2 = Cup()
  c2.percentFull = 100
  c1.percentFull eq 50
  c2.percentFull eq 100
}
