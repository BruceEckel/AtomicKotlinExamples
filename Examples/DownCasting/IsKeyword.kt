// DownCasting/IsKeyword.kt
package downcasting

fun main() {
  val b1: Base = Derived1() // Upcast
  if(b1 is Derived1)
    b1.g() // Within scope of "is" check
  val b2: Base = Derived2() // Upcast
  if(b2 is Derived2)
    b2.h() // Within scope of "is" check
}
