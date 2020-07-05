// MoreGenerics/BasicGenerics.kt
package moregenerics
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

fun main() {
  gFunc("Yellow") eq "Yellow"
  gFunc(1) eq 1
  gFunc(Dog()).bark() eq "Ruff!"       // [1]
  gFunc<Dog>(Dog()).bark() eq "Ruff!"

  GClass("Cyan").f() eq "Cyan"
  GClass(11).f() eq 11
  GClass(Dog()).f().bark() eq "Ruff!"  // [2]
  GClass<Dog>(Dog()).f().bark() eq "Ruff!"

  MFunc().f("Amber") eq "Amber"
  MFunc().f(111) eq 111
  MFunc().f(Dog()).bark() eq "Ruff!"   // [3]
  MFunc().f<Dog>(Dog()).bark() eq "Ruff!"
}
