// interoperability/NPEOnPlatformType.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import interoperability.JTool
import atomictest.*

fun main() {
  val xn: JTool? = JTool.get(null)  // [1]
  xn?.method() eq null

  val yn = JTool.get(null)          // [2]
  yn?.method() eq null              // [3]
  capture {
    yn.method()                     // [4]
  } contains listOf("NullPointerException")

  capture {
    val zn: JTool = JTool.get(null) // [5]
  } eq "NullPointerException: " +
    "get(null) must not be null"
}
