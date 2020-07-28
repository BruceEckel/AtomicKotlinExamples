// CreatingGenerics/Variance.kt
package creatinggenerics

open class Can
open class Beverage: Can()
class Grape: Beverage()

fun <T> fc(c: Crate<T>) {}
fun <T> fic(ic: InCrate<T>) {}
fun <T> foc(oc: OutCrate<T>) {}

fun normal() {
  val c: Can = f(Crate<Can>(Grape()), Grape())
  val cb: Beverage =
    f(Crate<Beverage>(Grape()), Grape())
  val cg: Grape = f(Crate(Grape()), Grape())

  val c1: Crate<Can> = Crate(Can())
  fc<Can>(Crate(Can()))
  c1.add(Grape())
  var can: Can = c1.get()
  val c2: InCrate<Can> = InCrate(Can())
  c2.add(Grape())
  val c3: OutCrate<Can> = OutCrate(Can())
  can = c3.get()
}

fun upcastCollection() {
  // fc<Can>(Crate<Grape>(Grape()))
  // fic<Can>(InCrate<Grape>(Grape()))
  var c6x = OutCrate(Grape())
  val c6: OutCrate<Can> = c6x
  // fc<Grape>(Crate<Can>(Grape()))
  fic(InCrate<Can>(Can()))
  fic(InCrate<Beverage>(Beverage()))
  fic(InCrate<Beverage>(Grape()))
  fic(InCrate<Can>(Beverage()))
  fic(InCrate<Can>(Grape()))
  foc<Grape>(OutCrate<Grape>(Grape()))
}
