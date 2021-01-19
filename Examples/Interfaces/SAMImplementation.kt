// Interfaces/SAMImplementation.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interfaces
import atomictest.eq

class VerboseZero : ZeroArg {
  override fun f() = 11
}

val verboseZero = VerboseZero()

val samZero = ZeroArg { 11 }

class VerboseOne : OneArg {
  override fun g(n: Int) = n + 47
}

val verboseOne = VerboseOne()

val samOne = OneArg { it + 47 }

class VerboseTwo : TwoArg {
  override fun h(i: Int, j: Int) = i + j
}

val verboseTwo = VerboseTwo()

val samTwo =  TwoArg { i, j -> i + j }

fun main() {
  verboseZero.f() eq 11
  samZero.f() eq 11
  verboseOne.g(92) eq 139
  samOne.g(92) eq 139
  verboseTwo.h(11, 47) eq 58
  samTwo.h(11, 47) eq 58
}
