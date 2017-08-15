// propertyAccessors/MyClass.kt
package propertyaccessors
import atomicTest.eq

class MyClass(var property: Int)

fun main(args: Array<String>) {
  val myClass = MyClass(10)
  myClass.property = 20
  myClass.property eq 20
}
