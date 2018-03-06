// IntroToGenerics/AnyInstead.kt
package introtogenerics
import atomictest.eq

class AnyHolder(private val value: Any) {
  fun get(): Any = value
}

class Dog {
  fun bark() = "Ruff!"
}

fun main(args: Array<String>) {
  val holder = AnyHolder(Dog())
  val any = holder.get()
  // Won't compile:
  // any.bark()

  val genericHolder = GenericHolder(Dog())
  val dog = genericHolder.get()
  dog.bark() eq "Ruff!"
}
