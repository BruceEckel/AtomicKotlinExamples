// interoperability/AnnotatedJava.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interop
import interoperability.AnnotatedJTool
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
      "interoperability.JTool"
    ::c.returnType eq
      "interoperability.JTool?"
    ::d.returnType eq
      "interoperability.JTool?"
  }
}
