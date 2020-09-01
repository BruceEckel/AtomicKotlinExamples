// Interoperability/NPEOnPlatformType.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
import Interoperability.JTool
import atomictest.*

fun main() {
  val xn = JTool.get(null)          // [1]
  xn?.method() eq null              // [2]
  capture {
    xn.method()                     // [3]
  } eq "NullPointerException"

  val yn: JTool? = JTool.get(null)  // [4]
  yn?.method() eq null

  capture {
    val zn: JTool = JTool.get(null) // [5]
  } eq "NullPointerException: " +
    "JTool.get(null) must not be null"
}
