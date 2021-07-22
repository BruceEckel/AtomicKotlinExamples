// OperatorOverloading/OpOverloadingSoln3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operatorOverloadingExercise3
import atomictest.*

class Repository<T>(initSize: Int = 10) {
  private val list =
    MutableList<T?>(initSize) { null }
  operator fun plusAssign(rv: T) {
    val i = list.indexOf(null)
    if(i == -1)
      list += rv
    else
      list[i] = rv
  }
  operator fun set(n: Int, rv: T) {
    require(n >= 0 && n < list.size) {
      "set() index $n out of range"
    }
    requireNotNull(list[n]) {
      "set() accessing null element"
    }
    list[n] = rv
  }
  operator fun get(n: Int): T {
    require(n >= 0 && n < list.size) {
      "get() index $n out of range"
    }
    val result = requireNotNull(list[n]) {
      "get() accessing null element"
    }
    return result
  }
  override fun toString() =
    list.joinToString(", ")
}

fun main() {
  val r = Repository<Int>(5)
  (1..7).forEach {
    r += it * 10
    trace(r)
  }
  trace("r[4]: ${r[4]}")
  r[4] = 99
  trace("r[4]: ${r[4]}")
  trace(r)
  capture { r[7] } eq
    "IllegalArgumentException: get() " +
    "index 7 out of range"
  capture { r[7] = 100 } eq
    "IllegalArgumentException: set() " +
    "index 7 out of range"
  val r2 = Repository<Int>(5)
  capture { r2[3] } eq
    "IllegalArgumentException: get() " +
    "accessing null element"
  capture { r2[3] = 100 } eq
    "IllegalArgumentException: set() " +
    "accessing null element"
  trace eq """
    10, null, null, null, null
    10, 20, null, null, null
    10, 20, 30, null, null
    10, 20, 30, 40, null
    10, 20, 30, 40, 50
    10, 20, 30, 40, 50, 60
    10, 20, 30, 40, 50, 60, 70
    r[4]: 50
    r[4]: 99
    10, 20, 30, 40, 99, 60, 70
  """
}
