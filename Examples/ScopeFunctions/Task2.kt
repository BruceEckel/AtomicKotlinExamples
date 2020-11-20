// ScopeFunctions/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package scopeFunctionsExercise2

import atomictest.eq

fun <T, R> with(receiver: T, block: T.() -> R): R {
  return receiver.block()
}

fun <T, R> T.run(block: T.() -> R): R {
  return block()
}

fun <T, R> T.let(block: (T) -> R): R {
  return block(this)
}

fun <T> T.apply(block: T.() -> Unit): T {
  block()
  return this
}

fun <T> T.also(block: (T) -> Unit): T {
  block(this)
  return this
}

fun main() {
  val sb = StringBuilder()
  with(sb) {
    append("0")
  }
  sb.toString() eq "0"

  StringBuilder().run {
    append("1")
    toString()
  } eq "1"

  StringBuilder().let {
    it.append("2")
    it.toString()
  } eq "2"

  StringBuilder().apply {
    append("3")
  }.toString() eq "3"

  StringBuilder().also {
    it.append("4")
  }.toString() eq "4"

  class Rectangle(var width: Int = 0, var height: Int = 0)

  val map = mapOf("square" to Rectangle())
  val square = map["square"]?.apply {
    width = 20
    height = 20
  }
  square?.width eq 20
  square?.height eq 20
}
