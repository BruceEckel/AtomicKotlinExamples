// IntroToGenerics/GenericFunction.kt
package introtogenerics
import atomictest.eq

fun <T> id(arg: T): T = arg

fun main(args: Array<String>) {
  id("Yellow") eq "Yellow"
  id(1) eq 1
  id(Dog()).bark() eq "Ruff!"
}
