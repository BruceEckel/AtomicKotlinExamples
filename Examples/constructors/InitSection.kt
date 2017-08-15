// constructors/InitSection.kt
package constructors

class X(i: Int) {
  init {
    println("Initializing X(i=$i)")
  }
}

fun main(args: Array<String>) {
  val x1 = X(1)
  val x2 = X(2)
}
/* Output:
Initializing X(i=1)
Initializing X(i=2)
*/
