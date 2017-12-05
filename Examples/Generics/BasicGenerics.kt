// Generics/BasicGenerics.kt
package generics
import atomictest.*

fun <T> gFunc(arg: T): T = arg

class gClass<T>(val x: T) {
  fun f(): T = x
}

interface gInterface<T> {
  val x: T
  fun f(): T
}

fun main(args: Array<String>) {
  gFunc("Yellow") eq "Yellow"
  gFunc(1) eq 1
  gFunc(Dog()).bark() eq "Ruff!"       // [1]

  gClass("Yellow").f() eq "Yellow"
  gClass(1).f() eq 1
  gClass(Dog()).f().bark() eq "Ruff!"  // [2]
}
