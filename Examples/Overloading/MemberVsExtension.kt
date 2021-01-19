// Overloading/MemberVsExtension.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package overloading
import atomictest.eq

class My {
  fun foo() = 0
}

fun My.foo() = 1             // [1]

fun My.foo(i: Int) = i + 2   // [2]

fun main() {
  My().foo() eq 0
  My().foo(1) eq 3
}
