// companionObjects/CreateInCompanionObject.kt
package companionObjects5

import atomicTest.eq

class Numbered
private constructor(private val id: Int) {
  override fun toString(): String = "#$id"
  companion object {
    private var n = 0
    fun create() = Numbered(n++)
  }
}

fun main(args: Array<String>) {
  val n1 = Numbered.create()
  val n2 = Numbered.create()
  n1 eq "#0"
  n2 eq "#1"
}
