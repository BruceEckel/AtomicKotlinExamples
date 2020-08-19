// Interoperability/AnnotatedJava.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package interop
import Interoperability.AnnotatedJTool
import atomictest.eq

object KotlinCode2 {
  val a = AnnotatedJTool.getSafe("")
  // Doesn't compile:
  // val b = AnnotatedJTool.getSafe(null)
  val c = AnnotatedJTool.getUnsafe("")
  val d = AnnotatedJTool.getUnsafe(null)
}

fun main() {
  with(KotlinCode2) {
    ::a.returnType eq
      "Interoperability.JTool"
    ::c.returnType eq
      "Interoperability.JTool?"
    ::d.returnType eq
      "Interoperability.JTool?"
  }
}
