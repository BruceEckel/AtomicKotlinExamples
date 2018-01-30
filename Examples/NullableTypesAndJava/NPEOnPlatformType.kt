// NullableTypesAndJava/NPEOnPlatformType.kt
import javacode.JTool
import atomictest.*

fun main(args: Array<String>) {
  val cn = JTool.get(null)
  cn?.method() eq null              // [1]
  capture {
    cn.method()                     // [2]
  } eq "NullPointerException"

  val an: JTool? = JTool.get(null)  // [3]
  an?.method() eq null

  capture {
    val bn: JTool = JTool.get(null) // [4]
  } eq "IllegalStateException: " +
    "JTool.get(null) must not be null"
}
