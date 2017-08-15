// propertyAccessors/PropertyInInterface.kt
package propertyaccessors
import atomicTest.eq

interface MyInterface {
  val number: Int                                 // [1]

  val isPositive: Boolean
    get() = number > 0                            // [2]
}

class C(override val number: Int) : MyInterface   // [3]

class D : MyInterface {
  override val number: Int                        // [4]
    get() = 5
}

fun main(args: Array<String>) {
  val list: List<MyInterface> = listOf(C(10), C(-10), D())

  var sum = 0
  for (i in list) {                 // [5]
    if (i.isPositive) {
        sum += i.number                          // [5]
    }
  }
  sum eq 15
}
