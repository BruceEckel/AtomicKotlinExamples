// FromKotlin/UseNullableJavaTool.kt
import FromKotlin.NullableJavaTool
import atomictest.*

fun main(args: Array<String>) {
  val a = NullableJavaTool.get()
  capture {
    val b: NullableJavaTool =
      NullableJavaTool.get()
  } eq "IllegalStateException"
  val c: NullableJavaTool? =
    NullableJavaTool.get()
  capture {
    a.method()
  } eq "NullPointerException"
  c?.method() eq null
}
