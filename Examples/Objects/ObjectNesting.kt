// Objects/ObjectNesting.kt
import atomictest.eq

object Outer {
  object Inner1 {
    val a = "Outer.Inner1"
  }
}

class WithObject {
  object Inner2 {
    val b = "WithObject.Inner2"
  }
}

fun main(args: Array<String>) {
  Outer.Inner1.a eq "Outer.Inner1"
  WithObject.Inner2.b eq "WithObject.Inner2"
}
