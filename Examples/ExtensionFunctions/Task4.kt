// ExtensionFunctions/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package extensionFunctionsExercise4
import atomictest.eq

class Book(val title: String)

fun Book.categorize(category: String) =
  """title: "$title", category: $category"""

fun main() {
  Book("Dracula").categorize("Vampire") eq
    """title: "Dracula", category: Vampire"""
}
