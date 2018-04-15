// FromListsToMaps/TransformingMap.kt
import atomictest.eq

fun main(args: Array<String>) {
  val even = mapOf(2 to "two", 4 to "four")
  even.map { entry ->                   // [1]
    "${entry.key}=${entry.value}"
  } eq listOf("2=two", "4=four")

  even.map { (key, value) ->
    "$key=$value"                       // [2]
  } eq listOf("2=two", "4=four")

  even.mapKeys { (num, _) -> -num }     // [3]
    .mapValues { (_, str) -> "minus $str" } eq
    mapOf(-2 to "minus two",
      -4 to "minus four")

  even.map { (key, value) ->
    -key to "minus $value"
  }.toMap() eq mapOf(-2 to "minus two", // [4]
    -4 to "minus four")
}
