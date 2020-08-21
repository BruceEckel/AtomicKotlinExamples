// MemberReferences/ExtensionReference.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package memberreferences
import atomictest.eq

fun Int.times47() = times(47)

class Frog
fun Frog.speak() = "Ribbit!"

fun goInt(n: Int, g: (Int) -> Int) = g(n)

fun goFrog(frog: Frog, g: (Frog) -> String) =
  g(frog)

fun main() {
  goInt(12, Int::times47) eq 564
  goFrog(Frog(), Frog::speak) eq "Ribbit!"
}
