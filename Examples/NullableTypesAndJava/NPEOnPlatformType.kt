// NullableTypesAndJava/NPEOnPlatformType.kt
import FromKotlin.JavaTool
import atomictest.*

fun main(args: Array<String>) {
  val cn = JavaTool.get(null)
  cn?.method() eq null                    // [1]
  capture {
    cn.method()                           // [2]
  } eq "NullPointerException"

  val an: JavaTool? = JavaTool.get(null)
  an?.method() eq null

  capture {
    val bn: JavaTool = JavaTool.get(null)
  } eq "IllegalStateException"           // [3]
}
