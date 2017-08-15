// extensionsForNullableTypes/ExtensionsOnNullableString.kt
import atomicTest.eq

fun main(args: Array<String>) {
  val s1: String? = null
  s1.isNullOrEmpty() eq true

  val s2: String? = "abc"
  s2.isNullOrBlank() eq false

  val s3: String = "    "
  s3.isNullOrBlank() eq true
}
