// OperatorOverloading/Swearing.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatoroverloading
import atomictest.eq

infix fun String.`#!%`(s: String) =
  "$this Rowzafrazaca $s"

fun main() {
  "howdy" `#!%` "Ma'am!" eq
    "howdy Rowzafrazaca Ma'am!"
}
