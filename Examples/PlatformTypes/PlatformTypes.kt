// PlatformTypes/PlatformTypes.kt
import javacode.JTool
import atomictest.eq

object KotlinCode {
  val a: JTool? = JTool.get("")  // [1]
  val b: JTool = JTool.get("")   // [2]
  val c = JTool.get("")          // [3]
}

fun main(args: Array<String>) {
  with(KotlinCode) {
    a?.method() eq "Success"     // [4]
    b.method() eq "Success"
    c.method() eq "Success"      // [5]
    ::a.returnType eq "javacode.JTool?"
    ::b.returnType eq "javacode.JTool"
    ::c.returnType eq
      "javacode.JTool!"          // [6]
  }
}
