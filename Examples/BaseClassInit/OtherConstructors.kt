// BaseClassInit/OtherConstructors.kt
package baseclassinit
import atomictest.eq

open class Base(val i: Int)

class Derived : Base {
  constructor(i: Int) : super(i)
  constructor() : this(9)
}

fun main(args: Array<String>) {
  val d1 = Derived(11)
  d1.i eq 11
  val d2 = Derived()
  d2.i eq 9
}
