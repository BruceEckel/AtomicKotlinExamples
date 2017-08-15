// baseClassInitialization/CallingOtherConstructors.kt
package baseclassinit
import atomicTest.eq

open class Base(val i: Int)

class Derived : Base {
  constructor(i: Int) : super(i)
  constructor() : this(0)
}

fun main(args: Array<String>) {
  val d1 = Derived(1)
  d1.i eq 1

  val d2 = Derived()
  d2.i eq 0
}
