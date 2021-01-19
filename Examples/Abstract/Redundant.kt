// Abstract/Redundant.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package abstractclasses

interface Redundant {
  abstract val x: Int
  abstract fun f(): Int
  abstract fun g(n: Double)
}

interface Removed {
  val x: Int
  fun f(): Int
  fun g(n: Double)
}
