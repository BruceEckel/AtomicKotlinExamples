// LateInitialization/LateInitSoln2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package lateInitializationExercise2
import atomictest.eq

class A {
  lateinit var s: String
  fun initialize(): A {
    s = "Initialized"
    return this
  }
}

class B {
  val a by lazy { A().initialize() }
}

fun main() {
  val b = B()
  b.a.s eq "Initialized"
}
