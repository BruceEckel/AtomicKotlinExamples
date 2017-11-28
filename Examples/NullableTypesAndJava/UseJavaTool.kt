// NullableTypesAndJava/UseJavaTool.kt
import FromKotlin.JavaTool
import atomictest.*

object KotlinCode {
  val a: JavaTool = JavaTool.get("")
  val b: JavaTool? = JavaTool.get("")
  val c = JavaTool.get("")

  fun showTypes() {
    ::a.returnType eq "FromKotlin.JavaTool"
    ::b.returnType eq "FromKotlin.JavaTool?"
    ::c.returnType eq "FromKotlin.JavaTool!"
  }
}

fun main(args: Array<String>) {
  KotlinCode.showTypes()

  // Null references:
  capture {
    val an: JavaTool = JavaTool.get(null)
  } eq "IllegalStateException"
  val bn: JavaTool? = JavaTool.get(null)
  bn?.method() eq null
  val cn = JavaTool.get(null)
  cn?.method() eq null
  capture {
    cn.method()
  } eq "NullPointerException"
}
