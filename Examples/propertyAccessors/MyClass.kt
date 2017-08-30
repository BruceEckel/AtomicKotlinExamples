// propertyAccessors/MyClass.kt
package propertyAccessors
import atomicTest.eq

class MyClass(var i: Int)

fun main(args: Array<String>) {
  val myClass = MyClass(10)
  myClass.i eq 20 // Read the 'i' property
  myClass.i = 20  // Write to the 'i' property
}
