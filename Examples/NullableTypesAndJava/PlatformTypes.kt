// NullableTypesAndJava/PlatformTypes.kt
import JavaCode.JTool
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
    ::a.returnType eq "JavaCode.JTool?"
    ::b.returnType eq "JavaCode.JTool"
    ::c.returnType eq "JavaCode.JTool!"
  }
}
