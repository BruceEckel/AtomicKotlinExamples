// Objects/ObjectNesting.kt
import atomictest.eq

object Outer {
  object Nested1 {
    val a = "Outer.Nested1"
  }
}

class WithObject {
  object Nested2 {
    val b = "WithObject.Nested2"
  }
}

fun main() {
  Outer.Nested1.a eq "Outer.Nested1"
  WithObject.Nested2.b eq
    "WithObject.Nested2"
}
