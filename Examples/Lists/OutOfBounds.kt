// Lists/OutOfBounds.kt
import atomictest.*

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3)
    capture {
        ints[3]
    } eq "ArrayIndexOutOfBoundsException: 3"
}
