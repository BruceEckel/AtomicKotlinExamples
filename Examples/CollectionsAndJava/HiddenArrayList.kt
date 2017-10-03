// CollectionsAndJava/HiddenArrayList.kt
import atomictest.eq

fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3)
    list::class.qualifiedName eq
    "java.util.ArrayList"
}
