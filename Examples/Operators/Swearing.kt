// Operators/Swearing.kt
import atomictest.eq

infix fun String.`#!%`(s: String) =
  "$this Rowzafrazaca $s"

fun main(args: Array<String>) {
  "howdy" `#!%` "Ma'am!" eq
    "howdy Rowzafrazaca Ma'am!"
}
