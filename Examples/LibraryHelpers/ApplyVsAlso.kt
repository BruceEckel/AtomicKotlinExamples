// LibraryHelpers/ApplyVsAlso.kt
package libraryhelpers
import atomictest.eq

fun Window.copy() =
  Window("copy of $id").also {
    it.x = this.x               // [1]
    it.y = this.y
    it.width = this.width
    it.height = this.height
  }

fun main(args: Array<String>) {
  val first = Window("first").apply {
    width = 500
    height = 500
  }
  val second = first.copy()
  second.id eq "copy of first"
  second.width eq 500
}
