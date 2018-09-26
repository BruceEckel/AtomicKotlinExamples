// LibraryHelpers/ApplyVsAlso.kt
package libraryhelpers
import atomictest.eq

fun Window.dup() =
  Window("dup of $id").also {
    it.x = this.x               // [1]
    it.y = this.y
    it.w = this.w
    it.h = this.h
  }

fun Window.dup2() =
  Window("dup of $id").also { win ->
    win.x = this.x
    win.y = this.y
    win.w = this.w
    win.h = this.h
  }

fun main() {
  val first = Window("first").apply {
    w = 500
    h = 100
  }
  val second = first.dup()
  second.id eq "dup of first"
  second.w eq 500
  second.h eq 100
  val third = second.dup()
  third.id eq "dup of dup of first"
  third.w eq 500
  third.h eq 100
}
