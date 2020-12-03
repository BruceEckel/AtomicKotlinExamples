// ExtensionProperties/Task2.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionPropertiesExercise2
import atomictest.eq

val <T> List<T>.reversed: List<T>
  get() = reversed()

fun main() {
  val list = listOf(1, 2, 3)
  list.reversed eq listOf(3, 2, 1)
}
