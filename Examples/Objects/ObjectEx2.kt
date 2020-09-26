// Objects/ObjectEx2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package objectsExercise2
import atomictest.eq

object Outer {
  object Nested {
    val a = "Outer.Nested.a"
    object Nested {
      val a = "Outer.Nested.Nested.a"
    }
  }
}

class HasObject {
  object Nested {
    val a = "HasObject.Nested.a"
    object Nested {
      val a = "HasObject.Nested.Nested.a"
    }
  }
}

fun main() {
  Outer.Nested.a eq
    "Outer.Nested.a"
  HasObject.Nested.a eq
    "HasObject.Nested.a"
  Outer.Nested.Nested.a eq
    "Outer.Nested.Nested.a"
  HasObject.Nested.Nested.a eq
    "HasObject.Nested.Nested.a"
}
