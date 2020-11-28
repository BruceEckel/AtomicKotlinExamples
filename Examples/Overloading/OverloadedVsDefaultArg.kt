// Overloading/OverloadedVsDefaultArg.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package overloadingvsdefaultargs
import atomictest.*

fun foo(n: Int = 99) = trace("foo-1-$n")

fun foo() {
  trace("foo-2")
  foo(14)
}

fun main() {
  foo()
  trace eq """
    foo-2
    foo-1-14
  """
}
