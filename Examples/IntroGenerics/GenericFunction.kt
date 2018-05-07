// IntroGenerics/GenericFunction.kt
package introgenerics
import atomictest.eq

fun <T> identity(arg: T): T = arg

fun main(args: Array<String>) {
  identity("Yellow") eq "Yellow"
  identity(1) eq 1
  identity(Dog()).bark() eq "Ruff!"
}
