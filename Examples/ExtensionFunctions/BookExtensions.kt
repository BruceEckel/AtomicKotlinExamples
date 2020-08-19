// ExtensionFunctions/BookExtensions.kt
// ©2020 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

class Book(val title: String)

fun Book.categorize(category: String) =
  """title: "$title", category: $category"""

fun main() {
  Book("Dracula").categorize("Vampire") eq
    """title: "Dracula", category: Vampire"""
}
