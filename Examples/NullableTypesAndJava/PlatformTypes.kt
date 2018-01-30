// NullableTypesAndJava/PlatformTypes.kt
import javacode.JTool
import atomictest.eq

object KotlinCode {
  val a: JTool? = JTool.get("")
  val b: JTool = JTool.get("")
  val c = JTool.get("")
}

fun main(args: Array<String>) {
  with(KotlinCode) {
    a?.method() eq "Success"
    b.method() eq "Success"
    c.method() eq "Success"
    ::a.returnType eq "javacode.JTool?"
    ::b.returnType eq "javacode.JTool"
    ::c.returnType eq "javacode.JTool!"
  }
}
