// Generics/RandomList.kt
import java.util.Random
import atomictest.*

private val rand = Random(47)

fun <T> List<T>.select(): T =
  get(rand.nextInt(size))

fun main(args: Array<String>) {
  val rs = listOf("The", "quick", "brown",
    "fox", "jumped", "over", "the", "lazy",
    "brown", "dog")
  (0..11).map{rs.select()}.joinToString() eq
  """
  brown, over, fox, quick, quick, dog, brown,
  The, brown, lazy, brown, brown
  """
}
