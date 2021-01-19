// OperationsOnCollections/ByOperations.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operationsoncollections
import atomictest.eq

data class Product(
  val description: String,
  val price: Double
)

fun main() {
  val products = listOf(
    Product("bread", 2.0),
    Product("wine", 5.0)
  )
  products.sumByDouble { it.price } eq 7.0

  products.sortedByDescending { it.price } eq
    "[Product(description=wine, price=5.0)," +
    " Product(description=bread, price=2.0)]"
  products.minByOrNull { it.price } eq
    Product("bread", 2.0)
}
