// Generics/GenericVsAny.kt
package generics
import atomictest.eq

fun <T> g(arg: T) = arg
fun a(arg: Any) = arg

data class DC(val n:Int = 47, val g:Int = 11)

fun main(args: Array<String>) {
  fun nm(a: Any) = a::class.simpleName
  nm(g(DC())) eq "DC"
  nm(a(DC())) eq "DC"
}
