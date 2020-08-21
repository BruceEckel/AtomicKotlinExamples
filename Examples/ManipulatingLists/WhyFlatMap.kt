// ManipulatingLists/WhyFlatMap.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package manipulatinglists
import atomictest.eq

class Book(
  val title: String,
  val authors: List<String>
)

fun main() {
  val books = listOf(
    Book("1984", listOf("George Orwell")),
    Book("Ulysses", listOf("James Joyce"))
  )
  books.map { it.authors }.flatten() eq
    listOf("George Orwell", "James Joyce")

  books.flatMap { it.authors } eq
    listOf("George Orwell", "James Joyce")
}
