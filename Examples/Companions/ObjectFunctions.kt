// Companions/ObjectFunctions.kt
import atomicTest.eq

class CompanionObjectFunction {
  companion object {
    private var n: Int = 0
    fun increment(): Int {
      n += 1
      return n
    }
  }
}

fun main(args: Array<String>) {
  CompanionObjectFunction.increment() eq 1
  CompanionObjectFunction.increment() eq 2
}
