// CreatingGenerics/Constraints.kt
package creatinggenerics
import kotlin.random.Random

private val rnd = Random(47)

// Can't return exact type:
fun List<Disposable>.aboth(): Disposable {
  val d: Disposable = this[rnd.nextInt(size)]
  d.action()
  return d
}

fun <T> List<T>.uboth(): T {
  val d: T = this[rnd.nextInt(size)]
  // Can't access action() without constraint:
  // d.action()
  return d
}

fun <T: Disposable> List<T>.cboth(): T {
  val d: T = this[rnd.nextInt(size)]
  d.action()
  return d
}

fun constraints() {
  val c: Recyclable = recyclables.cboth()
  val u: Recyclable = recyclables.uboth()
  val a: Disposable = recyclables.aboth()
}
