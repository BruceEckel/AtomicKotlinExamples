// CreatingGenerics/Constraints.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import kotlin.random.Random

private val rnd = Random(47)

// Accesses action() but can't return
// the exact type:
fun List<Disposable>.inexact(): Disposable {
  val d: Disposable = this[rnd.nextInt(size)]
  d.action()
  return d
}

// Can't access action() without a constraint:
fun <T> List<T>.noAccess(): T {
  val d: T = this[rnd.nextInt(size)]
  // d.action()
  return d
}

// Access action() and return the exact type:
fun <T: Disposable> List<T>.both(): T {
  val d: T = this[rnd.nextInt(size)]
  d.action()
  return d
}

fun constraints() {
  val i: Disposable = recyclables.inexact()
  val n: Recyclable = recyclables.noAccess()
  val b: Recyclable = recyclables.both()
}
