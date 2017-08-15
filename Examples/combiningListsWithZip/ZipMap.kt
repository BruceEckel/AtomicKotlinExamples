// combiningListsWithZip/ZipMap.kt
package combininglistswithzip
import atomicTest.eq

data class Person(val name: String, val ID: Int)

fun main(args: Array<String>) {
  val names = listOf("Bob", "Jill", "Jim")
  val IDs = listOf(1731, 9274, 8378)
  names.zip(IDs).map {
    (n, id) ->
    Person(n, id)
  } eq "[Person(name=Bob, ID=1731), " +
      "Person(name=Jill, ID=9274), Person(name=Jim, ID=8378)]"
}
