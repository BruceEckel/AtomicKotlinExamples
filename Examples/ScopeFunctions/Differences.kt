// ScopeFunctions/Differences.kt
package scopefunctions
import atomictest.eq

data class Tag(var n: Int = 0) {
  var s: String = ""
  fun increment() = n++
}

fun main() {
  // let(): Access object with 'it'
  // Returns last expression in lambda
  val let1: Int = Tag(1).let {
    it.increment()
    it.s = "let: ${it.n}"
    it.n
  }
  let1 eq 2

  // let() with named lambda argument:
  val let2: Int = Tag(2).let { tag ->
    tag.increment()
    tag.s = "let: ${tag.n}"
    tag.n
  }
  let2 eq 3

  // run(): Access object with 'this'
  // Returns last expression in lambda
  val run1: Int = Tag(3).run {
    increment()
    s = "run: $n"
    n
  }
  run1 eq 4

  // with(): Access object with 'this'
  // Returns last expression in lambda
  val with1: Int = with(Tag(4)) {
    increment()
    s = "with: $n"
    n
  }
  with1 eq 5

  // apply(): Access object with 'this'
  // Returns modified object
  val apply1: Tag = Tag(5).apply {
    increment()
    s = "apply: $n"
  }
  apply1 eq "Tag(n=6)"

  // also(): Access object with 'it'
  // Returns modified object
  val also1: Tag = Tag(6).also {
    it.increment()
    it.s = "also: ${it.n}"
  }
  also1 eq "Tag(n=7)"

  // also() with named lambda argument:
  val also2: Tag = Tag(7).also { tag ->
    tag.increment()
    tag.s = "also: ${tag.n}"
  }
  also2 eq "Tag(n=8)"
}
