// ComplexConstructors/ArrayInit.kt
import atomictest.eq

fun main(args: Array<String>) {
    val n1 = Array(5, { 10 * (it + 1) })
    n1.asList() eq "[10, 20, 30, 40, 50]"
    val n2 = Array(5) { 10 * (it + 1) }
    n2.asList() eq "[10, 20, 30, 40, 50]"
}
