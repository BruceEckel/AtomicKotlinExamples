// ScopeFunctions/Differences.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions
import atomictest.eq

data class Tag(var n: Int = 0) {
  var s: String = ""
  fun increment() = ++n
}

fun main() {
  // let(): Access object with 'it'
  // Returns last expression in lambda
  val let1: Int = Tag(1).let {
    it.s = "let: ${it.n}"
    it.increment()
  }
  let1 eq 2

  // let() with named lambda argument:
  val let2: Int = Tag(2).let { tag ->
    tag.s = "let: ${tag.n}"
    tag.increment()
  }
  let2 eq 3

  // run(): Access object with 'this'
  // Returns last expression in lambda
  val run1: Int = Tag(3).run {
    s = "run: $n"
    increment()
  }
  run1 eq 4

  // with(): Access object with 'this'
  // Returns last expression in lambda
  val with1: Int = with(Tag(4)) {
    s = "with: $n"
    increment()
  }
  with1 eq 5

  // apply(): Access object with 'this'
  // Returns modified object
  val apply1: Tag = Tag(5).apply {
    s = "apply: $n"
    increment()
  }
  apply1 eq "Tag(n=6)"

  // also(): Access object with 'it'
  // Returns modified object
  val also1: Tag = Tag(6).also {
    it.s = "also: ${it.n}"
    it.increment()
  }
  also1 eq "Tag(n=7)"

  // also() with named lambda argument:
  val also2: Tag = Tag(7).also { tag ->
    tag.s = "also: ${tag.n}"
    tag.increment()
  }
  also2 eq "Tag(n=8)"
}
