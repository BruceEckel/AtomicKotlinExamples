// CompanionObjects/CompanionFactory.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package companionobjects
import atomictest.eq

class Numbered2
private constructor(private val id: Int) {
  override fun toString() = "#$id"
  companion object Factory {
    fun create(size: Int) =
      List(size) { Numbered2(it) }
  }
}

fun main() {
  Numbered2.create(0) eq "[]"
  Numbered2.create(5) eq
    "[#0, #1, #2, #3, #4]"
}
