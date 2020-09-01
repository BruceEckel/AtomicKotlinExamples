// ExtensionFunctions/BookExtensions.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package extensionfunctions
import atomictest.eq

class Book(val title: String)

fun Book.categorize(category: String) =
  """title: "$title", category: $category"""

fun main() {
  Book("Dracula").categorize("Vampire") eq
    """title: "Dracula", category: Vampire"""
}
