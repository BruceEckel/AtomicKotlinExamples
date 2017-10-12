// SmartCasts/SmartCasts.kt
package smartcastsinkotlin
import atomictest.eq

class Dog {
  fun bark() = "yip!"
}

fun barkIfDog(a: Any) =
  if(a is Dog) a.bark() else "not Dog"

fun main(args: Array<String>) {
  barkIfDog(Dog()) eq "yip!"
  barkIfDog(42) eq "not Dog"
}
