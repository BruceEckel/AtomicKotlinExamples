// FromKotlin/UseJavaTool.kt
import FromKotlin.JavaTool
import atomictest.*

fun main(args: Array<String>) {
  val a = JavaTool.get("")
  val b: JavaTool = JavaTool.get("")
  val c: JavaTool? = JavaTool.get("")
  a.method() eq "Success"
  b.method() eq "Success"
  c?.method() eq "Success"

  // The types are the same:
  a::class eq "class FromKotlin.JavaTool"
  b::class eq "class FromKotlin.JavaTool"
  c!!::class eq "class FromKotlin.JavaTool"

  // Null references:
  val an = JavaTool.get(null)
  capture {
    val bn: JavaTool = JavaTool.get(null)
  } eq "IllegalStateException"
  val cn: JavaTool? = JavaTool.get(null)
  capture {
    an.method()
  } eq "NullPointerException"
  cn?.method() eq null
}
