// OperatorOverloading/Swearing.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

infix fun String.`#!%`(s: String) =
  "$this Rowzafrazaca $s"

fun main() {
  "howdy" `#!%` "Ma'am!" eq
    "howdy Rowzafrazaca Ma'am!"
}
