// ManipulatingLists/FlattenAndFlatMap.kt
import atomictest.eq

fun main() {
  val intRange = 1..3

  intRange.map {               // [1]
    a -> intRange.map { b -> a to b }
  } eq "[" +
    "[(1, 1), (1, 2), (1, 3)], " +
    "[(2, 1), (2, 2), (2, 3)], " +
    "[(3, 1), (3, 2), (3, 3)]" +
  "]"

  intRange.map {               // [2]
    a -> intRange.map { b -> a to b }
  }.flatten() eq "[" +
    "(1, 1), (1, 2), (1, 3), " +
    "(2, 1), (2, 2), (2, 3), " +
    "(3, 1), (3, 2), (3, 3)" +
  "]"

  intRange.flatMap {           // [3]
    a -> intRange.map { b -> a to b }
  } eq "[" +
    "(1, 1), (1, 2), (1, 3), " +
    "(2, 1), (2, 2), (2, 3), " +
    "(3, 1), (3, 2), (3, 3)" +
  "]"
}
