// LazyProperties/DifferentWaysOfCreation.kt
package lazyproperties

fun compute(i: Int): Int {
  println("Computation of $i")
  return i
}

class A {
  val first = compute(1)
  val second 
    get() = compute(2)
  val third by lazy { compute(3) } 
}

fun main(args: Array<String>) {
  println("// init")
  val a = A()
  println("// first")
  println(a.first)
  println(a.first)
  println("// second")
  println(a.second)
  println(a.second)
  println("// third")
  println(a.third)
  println(a.third)
}
/* Output:
// init
Computation of 1
// first
1
1
// second
Computation of 2
2
Computation of 2
2
// third
Computation of 3
3
3
*/
