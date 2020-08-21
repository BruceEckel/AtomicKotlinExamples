// Objects/ObjectNesting.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package objects
import atomictest.eq

object Outer {
  object Nested {
    val a = "Outer.Nested.a"
  }
}

class HasObject {
  object Nested {
    val a = "HasObject.Nested.a"
  }
}

fun main() {
  Outer.Nested.a eq "Outer.Nested.a"
  HasObject.Nested.a eq "HasObject.Nested.a"
}
