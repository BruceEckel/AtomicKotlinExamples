// LazyInitialization/PropertyOptions.kt
package lazyinitialization

fun compute(i: Int): Int {
  println("Compute $i")
  return i
}

class Properties {
  val atDefinition = compute(1)
  val getter
    get() = compute(2)
  val lazyInit by lazy { compute(3) }
}

fun main() {
  println("Properties():")
  val p = Properties()
  println("atDefinition:")
  println(p.atDefinition)
  println(p.atDefinition)
  println("getter:")
  println(p.getter)
  println(p.getter)
  println("lazyInit:")
  println(p.lazyInit)
  println(p.lazyInit)
}
/* Output:
Properties():
Compute 1
atDefinition:
1
1
getter:
Compute 2
2
Compute 2
2
lazyInit:
Compute 3
3
3
*/
