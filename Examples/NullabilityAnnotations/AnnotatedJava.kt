// NullabilityAnnotations/AnnotatedJava.kt
package usingannotatedtypes
import JavaCode.AnnotatedJTool
import atomictest.eq

object KotlinCode {
  val a = AnnotatedJTool.getSafe("")
  // Won't compile:
  // val b = AnnotatedJTool.getSafe(null)
  val c = AnnotatedJTool.getUnsafe("")
  val d = AnnotatedJTool.getUnsafe(null)
}

fun main(args: Array<String>) {
  with(KotlinCode) {
    ::a.returnType eq "JavaCode.JTool"
    ::c.returnType eq "JavaCode.JTool?"
    ::d.returnType eq "JavaCode.JTool?"
  }
}
