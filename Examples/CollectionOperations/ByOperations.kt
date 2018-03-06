// CollectionOperations/ByOperations.kt
import atomictest.eq

data class Product(
  val description: String,
  val price: Double
)

fun main(args: Array<String>) {
  val products = listOf(
    Product("bread", 2.0),
    Product("wine", 5.0)
  )
  val cheapest = products.minBy { it.price }
  cheapest eq Product("bread", 2.0)

  val sum = products.sumByDouble { it.price }
  sum eq 7.0
}
