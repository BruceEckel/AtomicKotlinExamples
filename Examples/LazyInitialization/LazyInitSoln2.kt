// LazyInitialization/LazyInitSoln2.kt
package lazyinitsoln2

class Outer {
  init {
    println("Creating Outer")
  }
  val s: String by lazy {
    println("Initializing Outer.s")
    "Hi"
  }
  inner class Inner() {
    init {
      println("Creating Inner")
    }
    val si: String by lazy {
      println("Initializing Inner.si")
      "Howdy $s"
    }
  }
  companion object {
    fun f() {
      println("companion object f()")
    }
    val sc: String by lazy {
      println("Initializing companion sc")
      "Hello"
    }
  }
}

fun main() {
  val o = Outer()
  println("Outer created")
  val inner = o.Inner()
  println("Inner created")
  println("First access: inner.si:")
  println(inner.si)
  println("Second access: inner.si:")
  println(inner.si)
  Outer.f()
  println(Outer.sc)
}
