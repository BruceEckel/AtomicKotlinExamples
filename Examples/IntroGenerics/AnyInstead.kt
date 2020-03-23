// IntroGenerics/AnyInstead.kt
package introgenerics
import atomictest.eq

class AnyHolder(private val value: Any) {
  fun getValue(): Any = value
}

class Dog {
  fun bark() = "Ruff!"
}

fun main() {
  val holder = AnyHolder(Dog())
  val any = holder.getValue()
  // Won't compile:
  // any.bark()

  val genericHolder = GenericHolder(Dog())
  val dog = genericHolder.getValue()
  dog.bark() eq "Ruff!"
}
