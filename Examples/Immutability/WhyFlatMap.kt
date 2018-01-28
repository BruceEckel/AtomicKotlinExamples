// Immutability/WhyFlatMap.kt
package immutability
import atomictest.eq

val intRange = 1..3

val unflat = intRange.map {
  a -> intRange.map { b -> a to b }
}

val flat1 = intRange.map {
  a -> intRange.map { b -> a to b }
}.flatten()

val flat2 = intRange.flatMap {
  a -> intRange.map { b -> a to b }
}

fun main(args: Array<String>) {
  unflat eq "[" +
    "[(1, 1), (1, 2), (1, 3)], " +
    "[(2, 1), (2, 2), (2, 3)], " +
    "[(3, 1), (3, 2), (3, 3)]" +
    "]"
  flat1 eq "[" +
    "(1, 1), (1, 2), (1, 3), " +
    "(2, 1), (2, 2), (2, 3), " +
    "(3, 1), (3, 2), (3, 3)" +
    "]"
  flat2 eq "[" +
    "(1, 1), (1, 2), (1, 3), " +
    "(2, 1), (2, 2), (2, 3), " +
    "(3, 1), (3, 2), (3, 3)" +
    "]"
}
