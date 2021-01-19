// LocalFunctions/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package localFunctionsExercise3
import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var i: Int? = null
    fun add(value: Int) {
        i = value
    }
    fun remove(): Int? {
        val result = i
        i = null
        return result
    }
    return Pair(::add, ::remove)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}
