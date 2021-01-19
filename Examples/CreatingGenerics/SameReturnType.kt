// CreatingGenerics/SameReturnType.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics
import kotlin.random.Random

private val rnd = Random(47)

fun List<Disposable>.aRandom(): Disposable =
  this[rnd.nextInt(size)]

fun <T: Disposable> List<T>.bRandom(): T =
  this[rnd.nextInt(size)]

fun <T> List<T>.cRandom(): T =
  this[rnd.nextInt(size)]

fun sameReturnType() {
  val a: Disposable = recyclables.aRandom()
  val b: Recyclable = recyclables.bRandom()
  val c: Recyclable = recyclables.cRandom()
}
