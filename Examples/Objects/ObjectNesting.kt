// Objects/ObjectNesting.kt
package objects
import atomictest.eq

object Outer {
  object Nested1 {
    val a = "Outer.Nested1"
  }
}

class HasObject {
  object Nested2 {
    val b = "HasObject.Nested2"
  }
}

fun main() {
  Outer.Nested1.a eq "Outer.Nested1"
  HasObject.Nested2.b eq "HasObject.Nested2"
}
