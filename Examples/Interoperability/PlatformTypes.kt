// Interoperability/PlatformTypes.kt
package interop
import Interoperability.JTool
import atomictest.eq

object KotlinCode {
  val a: JTool? = JTool.get("")  // [1]
  val b: JTool = JTool.get("")   // [2]
  val c = JTool.get("")          // [3]
}

fun main() {
  with(KotlinCode) {
    a?.method() eq "Success"     // [4]
    b.method() eq "Success"
    c.method() eq "Success"      // [5]
    ::a.returnType eq
      "Interoperability.JTool?"
    ::b.returnType eq
      "Interoperability.JTool"
    ::c.returnType eq
      "Interoperability.JTool!"  // [6]
  }
}
