// CreatingGenerics/SameReturnType.kt
package creatinggenerics
import kotlin.random.Random

private val rnd = Random(47)

fun <T: Disposable> List<T>.crandom(): T =
  this[rnd.nextInt(size)]

fun <T> List<T>.urandom(): T =
  this[rnd.nextInt(size)]

fun sameReturnType() {
  val c: Recyclable = recyclables.crandom()
  val u: Recyclable = recyclables.urandom()
}
