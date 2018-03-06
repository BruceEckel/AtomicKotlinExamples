// NullableExtensions/ReceiverVsParameter.kt
import atomictest.eq

fun isNullOrEmpty(s: String?): Boolean =
  s == null || s.isEmpty()

fun main(args: Array<String>) {
  isNullOrEmpty(null) eq true
  isNullOrEmpty("") eq true
}
