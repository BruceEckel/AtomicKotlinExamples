// interfaces/PropertyInInterface.kt
package interfaces
import atomicTest.eq

interface SignedInt {
  val number: Int                  // [1]
  val isPositive: Boolean
    get() = number > 0             // [2]
}

class C(override val number: Int):
  SignedInt                        // [3]

class D : SignedInt {
  override val number: Int         // [4]
    get() = 5
}

fun main(args: Array<String>) {
  val list: List<SignedInt> =
    listOf(C(10), C(-10), D())
  var sumPositive = 0
  for(i in list) {
    if(i.isPositive) {
      sumPositive += i.number      // [5]
    }
  }
  sumPositive eq 15
}
