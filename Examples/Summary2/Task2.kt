// Summary2/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package summaryIIExercise2
import atomictest.eq

class Boring2(val a: Double, val b: String, val c: Int) {
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val boring2 = Boring2(1.0, "abc", 3)
  boring2.a() eq 1.0
  boring2.b() eq "abc"
  boring2.c() eq 3
}
