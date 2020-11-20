// ClassDelegation/Task3.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package classDelegationExercise3
import atomictest.*

interface A {
  fun foo()
  fun bar()
}

interface B {
  fun foo()
  fun baz()
}

class AA : A {
  override fun foo() = trace("AA.foo()")
  override fun bar() = trace("AA.bar()")
}

class BB : B {
  override fun foo() = trace("BB.foo()")
  override fun baz() = trace("BB.baz()")
}

class Delegation(val a: A, val b: B) :
  A by a, B by b {
  override fun foo() {
    a.foo()
    b.foo()
    trace("Delegation.foo()")
  }
}

fun main() {
  val d = Delegation(AA(), BB())
  d.foo()
  d.bar()
  d.baz()
  trace eq
    """
      AA.foo()
      BB.foo()
      Delegation.foo()
      AA.bar()
      BB.baz()
    """
}
