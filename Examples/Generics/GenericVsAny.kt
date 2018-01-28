// Generics/GenericVsAny.kt
package generics
import atomictest.*

fun a(arg: Any): Any = arg
fun <T> g(arg: T): T = arg

data class N(val n: Int = 47)

val n = N()

fun main(args: Array<String>) {
  val da: Any = a(n)
  // Won't compile:
  // val da2: N = a(n)
  // You can cast it:
  val da3: N = a(n) as N
  // But you can cast it to anything:
  capture {
    val da4: Int = a(n) as Int
  } eq "ClassCastException: " +
    "generics.N cannot be cast to java.lang.Integer"
  // Generic retains the type information:
  val dg: N = g(n)
}
