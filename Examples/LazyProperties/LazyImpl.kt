// LazyProperties/LazyImpl.kt
class LazyProperty(val initializer: () -> Int) {
    private var helper: Int? = null
    val value: Int
        get() {
            if (helper == null) {
                helper = initializer()
            }
            return helper!!
        }
}

fun compute(i: Int): Int {
    println("Computation of $i")
    return i
}

fun main(args: Array<String>) {
    println("// init")
    val lazyProperty = LazyProperty { compute(5) }
    println("// access")
    println(lazyProperty.value)
    println(lazyProperty.value)
}
/* Output:
// init
// access
Computation of 5
5
5
*/
