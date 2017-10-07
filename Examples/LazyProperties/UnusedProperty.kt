// LazyProperties/UnusedProperty.kt
val lazyString: String by lazy {
    println("computation...")
    "result"
}

fun main(args: Array<String>) {
    println("lazy property is never used")
}
/* Output:
lazy property is never used
*/
