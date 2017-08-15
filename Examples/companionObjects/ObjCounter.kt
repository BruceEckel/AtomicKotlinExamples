// companionObjects/ObjCounter.kt
package companionobjects

import atomicTest.eq

class Count {
  val id = Count.id()
  override fun toString() = "Count$id"

  companion object {
    var n = -1
    fun id(): Int {
      n += 1
      return n
    }
  }
}

fun main(args: Array<String>) {
  listOf(Count(), Count(), Count(),
    Count(), Count()) eq
    "[Count0, Count1, Count2, Count3, Count4]"
}
