// Generics/AnyInstead.kt
package generics
import atomictest.eq

fun aFunc(arg: Any): Any = arg

class aClass(val x: Any) {
  fun f(): Any = x
}

fun main(args: Array<String>) {
  aFunc("Yellow") eq "Yellow"
  aFunc(1) eq 1
  // Won't compile:
  // aFunc(Dog()).bark() eq "Ruff!"

  aClass("Yellow").f() eq "Yellow"
  aClass(1).f() eq 1
  // Won't compile:
  // aClass(Dog()).f().bark() eq "Ruff!"
}
