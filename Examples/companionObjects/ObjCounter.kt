// companionObjects/ObjCounter.kt
package companionObjects4

import atomicTest.eq

class Numbered {
  private val id = id()
  override fun toString() = "#$id"

  companion object {
    var n = -1
    fun id(): Int {
      n += 1
      return n
    }
  }
}

fun main(args: Array<String>) {
  listOf(Numbered(), Numbered(), Numbered(),
    Numbered(), Numbered()) eq
    "[#0, #1, #2, #3, #4]"
}
