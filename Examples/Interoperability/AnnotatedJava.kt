// Interoperability/AnnotatedJava.kt
package nullabilityannotations
import javacode.AnnotatedJTool
import atomictest.eq

object KotlinCode {
  val a = AnnotatedJTool.getSafe("")
  // Won't compile:
  // val b = AnnotatedJTool.getSafe(null)
  val c = AnnotatedJTool.getUnsafe("")
  val d = AnnotatedJTool.getUnsafe(null)
}

fun main() {
  with(KotlinCode) {
    ::a.returnType eq "javacode.JTool"
    ::c.returnType eq "javacode.JTool?"
    ::d.returnType eq "javacode.JTool?"
  }
}
