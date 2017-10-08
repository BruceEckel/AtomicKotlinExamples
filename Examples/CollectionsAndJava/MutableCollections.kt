// CollectionsAndJava/MutableCollections.kt
import atomictest.eq

fun main(args: Array<String>) {
  mutableListOf(1, 2)::class.qualifiedName eq
    "java.util.ArrayList"
  mutableSetOf(1, 2)::class.qualifiedName eq
    "java.util.LinkedHashSet"
  mutableMapOf(
    1 to 1, 2 to 2)::class.qualifiedName eq
    "java.util.LinkedHashMap"
}
