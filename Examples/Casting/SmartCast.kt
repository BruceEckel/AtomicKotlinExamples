// Casting/SmartCast.kt
package casting
import atomictest.eq

class Dog {
  fun bark() = "yip!"
}

fun dogBark(a: Any) =
  if (a is Dog) a.bark() else "not Dog"

fun main() {
  dogBark(Dog()) eq "yip!"
  dogBark(42) eq "not Dog"
}
