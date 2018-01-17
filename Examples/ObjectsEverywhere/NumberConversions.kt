// ObjectsEverywhere/NumberConversions.kt

fun fraction(numerator: Long, denominator: Long) =
        numerator.toDouble() / denominator

fun main(args: Array<String>) {
    val num = 1
    val den = 2
    val f = fraction(num.toLong(), den.toLong())
    println(f)
}
/* Output:
0.5
*/
