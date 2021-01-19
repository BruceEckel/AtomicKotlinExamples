// Lambdas/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package lambdasExercise2
import atomictest.eq

data class Author(val name: String)

data class Book(val title: String, val author: Author)

fun getAuthors(books: List<Book>): Set<Author> =
  books.map { it.author }.toSet()

fun main() {
  val books = listOf(
    Book("The Philosopher's Stone", Author("J. K. Rowling")),
    Book("The Chamber of Secrets", Author("J. K. Rowling")),
    Book("The Prisoner of Azkaban", Author("J. K. Rowling")),
    Book("The Goblet of Fire", Author("J. K. Rowling")),
    Book("The Order of the Phoenix", Author("J. K. Rowling")),
    Book("The Half-Blood Prince", Author("J. K. Rowling")),
    Book("The Deathly Hallows", Author("J. K. Rowling"))
  )
  getAuthors(books) eq setOf(Author("J. K. Rowling"))
}
