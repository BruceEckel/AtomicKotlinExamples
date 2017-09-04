// Companions/CompanionFactory.kt
import atomictest.eq

class Numbered2
private constructor(private val id: Int) {
  override fun toString(): String = "#$id"
  companion object Factory {
    private var n = 0
    fun create(size: Int): List<Numbered2> {
      val result = mutableListOf<Numbered2>()
      for(i in 0 until size)
        result += Numbered2(n++)
      return result
    }
  }
}

fun main(args: Array<String>) {
  Numbered2.create(0) eq "[]"
  Numbered2.create(5) eq
    "[#0, #1, #2, #3, #4]"
}
