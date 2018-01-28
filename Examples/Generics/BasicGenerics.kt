// Generics/BasicGenerics.kt
package generics
import atomictest.eq

fun <T> gFunc(arg: T): T = arg

class GClass<T>(val x: T) {
  fun f(): T = x
}

class MFunc {
  fun <T> f(arg: T): T = arg
}

interface GInterface<T> {
  val x: T
  fun f(): T
}

fun main(args: Array<String>) {
  gFunc("Yellow") eq "Yellow"
  gFunc(1) eq 1
  gFunc(Dog()).bark() eq "Ruff!"       // [1]

  GClass("Cyan").f() eq "Cyan"
  GClass(11).f() eq 11
  GClass(Dog()).f().bark() eq "Ruff!"  // [2]

  MFunc().f("Amber") eq "Amber"
  MFunc().f(111) eq 111
  MFunc().f(Dog()).bark() eq "Ruff!"   // [3]
}
