// ClassDelegation/ClassDelegEx3.kt
package classdelegationex3
import atomictest.*

private val trace = Trace()

interface A {
  val x: Int
  val z: Int
  fun u()
  fun v()
}

interface B {
  val y: Int
  val z: Int
  fun v()
  fun w()
}

class AA : A {
  override val x = 1
  override val z = 1
  override fun u() = trace("AA.u()")
  override fun v() = trace("AA.v()")
}

class BB : B {
  override val y = 1
  override val z = 1
  override fun v() = trace("BB.v()")
  override fun w() = trace("BB.w()")
}

class Delegation(val a: A, val b: B) :
  A by a, B by b {
  override val z = a.z + b.z
  override fun v() {
    trace("Delegation.v()")
    a.v()
    b.v()
    trace("Delegation.z: $z")
  }
}

fun main() {
  val d = Delegation(AA(), BB())
  d.u()
  d.v()
  d.w()
  trace eq """
  AA.u()
  Delegation.v()
  AA.v()
  BB.v()
  Delegation.z: 2
  BB.w()
  """
}
