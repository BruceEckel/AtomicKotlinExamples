// NullableTypesAndJava/PlatformTypes.kt
import FromKotlin.JavaTool
import atomictest.eq

object KotlinCode {
  val a: JavaTool? = JavaTool.get("")
  val b: JavaTool = JavaTool.get("")
  val c = JavaTool.get("")
}

fun main(args: Array<String>) {
  with (KotlinCode) {
    a?.method() eq "Success"
    b.method() eq "Success"
    c.method() eq "Success"

    ::a.returnType eq "FromKotlin.JavaTool?"
    ::b.returnType eq "FromKotlin.JavaTool"
    ::c.returnType eq "FromKotlin.JavaTool!"
  }
}
