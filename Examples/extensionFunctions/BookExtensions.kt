// extensionFunctions/BookExtensions.kt
import atomicTest.eq

data class Book(val title: String)

fun Book.categorize(category: String) =
    """title: "$title", category: $category"""

fun main(args: Array<String>) {
  Book("Dracula").categorize("Vampire") eq
      """title: "Dracula", category: Vampire"""
}
